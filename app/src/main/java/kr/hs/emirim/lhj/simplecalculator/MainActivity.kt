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
        title="초간단 계산기"

        edit1=findViewById<EditText>(R.id.edit1)
        edit2=findViewById<EditText>(R.id.edit2)
        textResult=findViewById(R.id.text_result)
        btnAdd=findViewById(R.id.btn_plus)
        btnSub=findViewById(R.id.btn_minus)
        btnMul=findViewById(R.id.btn_multiply)
        btnDiv=findViewById(R.id.btn_devide)
        btnAdd.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)+Integer.parseInt(num2)
            textResult.text="계산 결과: "+result
        }
        btnSub.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)-Integer.parseInt(num2)
            textResult.text="계산 결과: "+result
        }
        btnMul.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)*Integer.parseInt(num2)
            textResult.text="계산 결과: "+result
        }
        btnDiv.setOnClickListener{
            num1=edit1.text.toString()
            num2=edit2.text.toString()
            result=Integer.parseInt(num1)/Integer.parseInt(num2)
            textResult.text="계산 결과: "+result
        }

    }
}