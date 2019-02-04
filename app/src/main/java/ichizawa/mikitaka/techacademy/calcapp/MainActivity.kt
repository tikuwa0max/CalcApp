package ichizawa.mikitaka.techacademy.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onClick(v: View?) {
        val intent = Intent(this, Second::class.java)

        var x:Double
        var y:Double

        x = editText.toString().toDouble()
        y = editText2.toString().toDouble()
        intent.putExtra("VALUE1", x)
        intent.putExtra("VALUE2", y)
        startActivity(intent)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }







}













