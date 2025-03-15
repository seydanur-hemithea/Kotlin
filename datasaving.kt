package com.seydanur.datasaving

import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seydanur.datasaving.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    lateinit var sharedPreferences: SharedPreferences
    var alinanKullaniciISmi:String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()
       
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        sharedPreferences=getSharedPreferences("com.seydanur.datasaving", MODE_PRIVATE)
        alinanKullaniciISmi=sharedPreferences.getString("isim","")
        if(alinanKullaniciISmi==""){
            binding.textView.text="Kaydedilen isim: "}

            else{
                binding.textView.text="Kaydedilen İsim: ${alinanKullaniciISmi}"

            }
        }
    //mode_private iile bizim olusturdugumuz dosyaya baska uygulama erisemiyor.mode append ile erisilir

    fun kaydet(view: View){
        val kullaniciIsmi=binding.editTextText.text.toString()
        if(kullaniciIsmi=="")
        {
            Toast.makeText(this@MainActivity,"isminizi bos birakmayin",Toast.LENGTH_LONG).show()

        }

        else{
            sharedPreferences.edit().putString("isim",kullaniciIsmi).apply()

            binding.textView.text="Kaydedilen isim: ${kullaniciIsmi}"
        }



    }
    fun sil(view:View){
        alinanKullaniciISmi=sharedPreferences.getString("isim","")
        if(alinanKullaniciISmi==""){
            sharedPreferences.edit().remove("isim").apply()

        }
        binding.textView.text="Kaydedilen İsim:"


    }
}