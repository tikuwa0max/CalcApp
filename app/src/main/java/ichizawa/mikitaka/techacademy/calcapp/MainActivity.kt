package ichizawa.mikitaka.techacademy.calcapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*





class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onClick(v: View) {
        val intent = Intent(this, Second::class.java)

        var x: Double
        var y: Double
        var z: Double


        try {
            x = editText.text.toString().toDouble()
            y = editText2.text.toString().toDouble()






            if (v.id == R.id.button1) {
                z = x + y
            } else if (v.id == R.id.button2) {
                z = x - y
            } else if (v.id == R.id.button3) {
                z = x * y
            } else {
                z = x / y
            }


            intent.putExtra("VALUE1", z)
            startActivity(intent)
        }catch (e: Exception){
            Log.d("kotlintest", "空欄があります")

        }
    }
















    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }
}
















