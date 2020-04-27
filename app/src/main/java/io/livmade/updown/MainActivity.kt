package io.livmade.updown

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var x = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UpBtn.setOnClickListener{
            var upCount = x++
            numText.setText(upCount.toString())
        }
        DownBtn.setOnClickListener {
           var downCount = x--
            numText.setText(downCount.toString())
        }
    }

}
