package com.example.result

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_rn_b.*

class RnB : AppCompatActivity() {

    val TAG : String = "RnB"
    var mediaplayer1 = MediaPlayer()
    var mediaplayer1_1 = MediaPlayer()
    var mediaplayer2 = MediaPlayer()
    var mediaplayer3 = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rn_b)

        mediaplayer1 = MediaPlayer.create(this, R.raw.randb_sad)
        mediaplayer1_1 = MediaPlayer.create(this, R.raw.randb_pleasure)
        mediaplayer2 = MediaPlayer.create(this, R.raw.randb_pleasure)
        mediaplayer3 = MediaPlayer.create(this, R.raw.randb_stressed)
/*
        var datas = listOf(mediaplayer1,mediaplayer2, mediaplayer3)

        fun <T> List<T>.random():T{
            val random = Random.nextInt((size))
            return get(random)
        }

        val select = datas.random()
*/
        //여기서 switch 문을 사용해서
        //1. 만약 select = mediaplayer1라면, mediaplayer1 재생
        //2. 똑같이 mediaplayer 2,3 일 때도 적용해준다.

        //버튼을 클릭하면 mp3를 재생
        Randb_sad.setOnClickListener{
            //재생할 파일 준비
            mediaplayer1?.start()
        }
        Randb_sad_stop.setOnClickListener{
            if (mediaplayer1.isPlaying()){
                mediaplayer1?.stop()
                mediaplayer1?.reset();
            }

        }

        Randb_pleasure.setOnClickListener{
            mediaplayer2?.start()
        }
        Randb_pleasure_stop.setOnClickListener{
            if (mediaplayer2.isPlaying()) {
                mediaplayer2?.stop()
                mediaplayer2?.reset();
            }
        }

        Randb_stressed.setOnClickListener{
            mediaplayer3?.start()
        }
        Randb_stressed_stop.setOnClickListener{
            if(mediaplayer3.isPlaying()){
                mediaplayer3?.stop()
                mediaplayer3?.reset();
            }
        }

    }

    override fun onDestroy () {
        super.onDestroy ()
        mediaplayer1?.release ()
        mediaplayer1_1?.release()
        mediaplayer2?.release ()
        mediaplayer3?.release ()
    }
}
