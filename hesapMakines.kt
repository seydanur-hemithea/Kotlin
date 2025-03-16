package com.seydanur.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seydanur.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
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

    }

    fun toplama(view: View){
        var birinciSayi=binding.birincisayi.text.toString().toInt()
        var ikinciSayi=binding.ikincisayi.text.toString().toInt()

            val toplam=birinciSayi+ikinciSayi
        binding.textView.text= toplam.toString()


    }
    fun cikarma(view: View){
        var birinciSayi=binding.birincisayi.text.toString().toInt()
        var ikinciSayi=binding.ikincisayi.text.toString().toInt()

            val kalan=birinciSayi-ikinciSayi
        binding.textView.text=kalan.toString()

    }
    fun bolme(view: View){
        var birinciSayi=binding.birincisayi.text.toString().toInt()
        var ikinciSayi=binding.ikincisayi.text.toString().toInt()


            val bolum=birinciSayi/ikinciSayi
        binding.textView.text=bolum.toString()

    }
    fun carpma(view: View){
        var birinciSayi=binding.birincisayi.text.toString().toInt()
        var ikinciSayi=binding.ikincisayi.text.toString().toInt()

            val carpim=birinciSayi*ikinciSayi
        binding.textView.text=carpim.toString()

    }
}