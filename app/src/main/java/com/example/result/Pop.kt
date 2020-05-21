package com.example.result

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pop.*
import kotlin.random.Random

class Pop : AppCompatActivity() {

    val TAG : String = "Pop"
    var mediaplayer1 = MediaPlayer()
    var mediaplayer1_1 = MediaPlayer()
    var mediaplayer1_2 = MediaPlayer()
    var mediaplayer2 = MediaPlayer()
    var mediaplayer2_1 = MediaPlayer()
    var mediaplayer2_2 = MediaPlayer()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pop)

        mediaplayer1 = MediaPlayer.create(this, R.raw.drum_pop_sad )
        mediaplayer1_1 = MediaPlayer.create(this, R.raw.guitar_dminor_pop_sad)
        mediaplayer1_2 = MediaPlayer.create(this, R.raw.guitar_fminor_pop_sad)
        mediaplayer2 = MediaPlayer.create(this, R.raw.drum_pop_pleasure_90)
        mediaplayer2_1 = MediaPlayer.create(this, R.raw.guitar_dminor_pop_pleasure_90)
        mediaplayer2_2 = MediaPlayer.create(this, R.raw.guitar_dminor_pop_pleasure_90_2)


        //버튼을 누르면 mediaplayer1_1과 1_2 중에서 랜덤으로 나온다.
        //드럼 비트는 고정
        Pop_sad.setOnClickListener {
            var medias = arrayOf(mediaplayer1_1, mediaplayer1_2)
            val medias_random = Random.nextInt(medias.size)
            medias[medias_random]?.start()
            mediaplayer1?.start()
        }

        //버튼을 클릭하면 mp3를 재생
        /*Pop_sad.setOnClickListener {
            //재생할 파일 준비
            mediaplayer1?.start()
            mediaplayer1_1?.start()
        }*/

        Pop_sad_stop.setOnClickListener{
            if (mediaplayer1.isPlaying() && mediaplayer1_1.isPlaying()) {
                mediaplayer1?.stop()
                mediaplayer1_1?.stop()
            }
            else{
                mediaplayer1?.stop()
                mediaplayer1_2?.stop()
            }
        }

        /*Pop_stressed.setOnClickListener{
            mediaplayer1?.start()
            mediaplayer1_2?.start()
        }

        Pop_stressed_stop.setOnClickListener{
            if (mediaplayer1.isPlaying() && mediaplayer1_2.isPlaying()) {
                mediaplayer1?.stop()
                mediaplayer1_2?.stop()
            }
        }*/

        Pop_pleasure.setOnClickListener{
            var medias = arrayOf(mediaplayer2_1, mediaplayer2_2)
            val medias_random = Random.nextInt(medias.size)
            medias[medias_random]?.start()
            mediaplayer2?.start()
        }

        Pop_pleasure_stop.setOnClickListener{
            if (mediaplayer2.isPlaying() && mediaplayer2_1.isPlaying()) {
                mediaplayer2?.stop()
                mediaplayer2_1?.stop()
            }
            else{
                mediaplayer2?.stop()
                mediaplayer2_2?.stop()
            }
        }
    }

    override fun onDestroy () {
        super.onDestroy ()
        mediaplayer1?.release ()
        mediaplayer1_1?.release()
        mediaplayer1_2?.release ()
    }
}

