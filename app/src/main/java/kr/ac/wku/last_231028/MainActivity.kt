package kr.ac.wku.last_231028

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kr.ac.wku.last_231028.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var commonID : String
        commonID = binding.edtID.toString()
        var commonPW : String
        commonPW = binding.edtPW.toString()

        binding.btnLogin.setOnClickListener {
            if(commonID=="admin@test.com" && commonPW=="qwer")
                Toast.makeText(this, "관리자입니다.", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}