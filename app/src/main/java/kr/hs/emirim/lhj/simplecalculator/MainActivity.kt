package kr.hs.emirim.lhj.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var edit1: EditText; lateinit var edit2: EditText;
    lateinit var btnAdd: Button;  lateinit var btnSub: Button;
    lateinit var btnMul: Button;  lateinit var btnDiv: Button;
    lateinit var textResult: TextView
    lateinit var num1: String; lateinit var num2:String
    var result: Int?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}