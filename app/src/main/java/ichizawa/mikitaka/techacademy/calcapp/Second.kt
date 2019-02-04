package ichizawa.mikitaka.techacademy.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1:Double = intent.getDoubleExtra("VALUE1", 0.0)
        val value2:Double = intent.getDoubleExtra("VALUE2", 0.0)

        textView.text = "${value1 + value2}"

    }


}
