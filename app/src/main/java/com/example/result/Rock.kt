package com.example.result

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_rock.*

class Rock : AppCompatActivity() {

    val TAG: String = "Pop"
    var mediaplayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rock)

        mediaplayer = MediaPlayer.create(this, R.raw.randb_stressed)

        //버튼을 클릭하면 mp3를 재생
        Rock_stressed.setOnClickListener {
            //재생할 파일 준비
            mediaplayer?.start()

        }
    }
}
