package com.seydanur.uygulamatemelleri

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seydanur.uygulamatemelleri.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //        val view = binding.root
        //        setContentView(view)

        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        binding.textView.text="binding metodu ile degistirdik"
        binding.button.setOnClickListener {
            binding.textView.text="butona tiklandi"*/
        }

        /* binding yaptigimizda bunlara iht,yacimiz kalmiyor asagidaki kodlar bigo da verimsiz
        // val image=findViewById<ImageView>(R.id.imageView)
        //image.setImageResource(R.drawable.istanbul2) kodu ile drawable i kaynak göterip resmi de degistirebiliyoruz
    //image icin kod sayfasında baglanti kuruyoruz1.yöntem Image View sınıf adi
        //Imageview i entegre etmek iicn alt+enter tusuna basiyoruz ,R.id. seklinde baslayan ise objenin id si
        //val myText=findViewById<TextView>(R.id.textView)
        //myText.text="texti degistirelim" */


    fun kaydet(view: View){
        binding.textView.text="butona tiklandi"

    }
    fun iptal(view: View){
        binding.textView.text="iptal edildi"

    }
    }


