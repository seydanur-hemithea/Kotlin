package com.seydanur.allertdialog

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.seydanur.allertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
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
       /* binding.button.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                println("butona tiklandi")
            }

        })*/// bruona t,kalandiginda neler olacagini bu sekilde atayabilyrozu

    }


    fun kaydet(view: View){
        val alert=AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Kayit Et")
        alert.setMessage("kayit etmek istediginize emin misiniz ?")
        alert.setPositiveButton("Evet",DialogInterface.OnClickListener { dialog, which ->
            Toast.makeText(this@MainActivity,"Kayit Ediildi",Toast.LENGTH_LONG).show()


        })
        alert.setNegativeButton("Hayir",object:DialogInterface.OnClickListener{
            override fun onClick(dialog: DialogInterface?, which: Int) {
               Toast.makeText(this@MainActivity,"iptal edildi",Toast.LENGTH_LONG).show()
            }
        })
        alert.show()


        //context
        //activite context,app context
       //1. Toast.makeText(this@MainActivity,"Hosgeldiniz",Toast.LENGTH_LONG).show()

    }

}