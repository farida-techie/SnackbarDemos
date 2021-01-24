package com.malkinfo.snackbarsdemos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** this button set Toast Massage*/
        btn0.setOnClickListener {
            Snackbar.make(lineraL0,
                "This is SnackBar Toast Massage",Snackbar.LENGTH_LONG)
                .show()
        }
        /**this button set New Activity*/
        btn1.setOnClickListener {
            Snackbar.make(lineraL0,
                    "you want Open New Activity..!!",Snackbar.LENGTH_LONG)
                    .setAction("Yes"){
                        startActivity(Intent(this@MainActivity,NewActivity::class.java))
                    }
                    .show()
        }
        /**this button open Dialog*/
        btn2.setOnClickListener {
            Snackbar.make(lineraL0,
                    "you want Dialog Box ..!!",Snackbar.LENGTH_LONG)
                    .setAction("Open"){
                        /**set Dialog Box*/
                        AlertDialog.Builder(this@MainActivity)
                                .setTitle("SnackBar Dialog Box")
                                .setMessage("This is SnackBra Dialog Box..!!")
                                .setPositiveButton("Ok"){
                                    d,_->
                                    d.dismiss()
                                }
                                .setNegativeButton("Cancel"){
                                    d,_->
                                    d.dismiss()
                                }
                                .create()
                                .show()
                    }
                    .show()
        }
        /**ok now run it*/
    }
}