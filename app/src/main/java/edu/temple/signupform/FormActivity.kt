package edu.temple.signupform

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameI = findViewById<EditText>(R.id.textPersonName)
        val emailI = findViewById<EditText>(R.id.textEmailAddress)
        val passwordI = findViewById<EditText>(R.id.textPassword)
        val passConfI = findViewById<EditText>(R.id.textPasswordConfirm)

        findViewById<Button>(R.id.saveButton)
            .setOnClickListener{
                val name: String = nameI.text.toString()
                val email: String = emailI.text.toString()
                val password: String = passwordI.text.toString()
                val passConf: String = passConfI.text.toString()
                if (name == "" || email == "" || password == "" || passConf == "") {
                    println("Test1 failed")
                    if(name == ""){
                        nameI.error = "Please fill out all boxes"
                    }
                    if(email == ""){
                        emailI.error = "Please fill out all boxes"
                    }
                    if(password == ""){
                        passwordI.error = "Please fill out all boxes"
                    }
                    if(passConf == ""){
                        passConfI.error = "Please fill out all boxes"
                    }
                    val t = Toast.makeText(applicationContext, "Please fill out all boxes", Toast.LENGTH_LONG)
                    println(t)
                    t.show()
                } else if (password != passConf) {
                    println("Test2 failed")
                    passConfI.error = "Passwords Don't Match"
                    val t = Toast.makeText(applicationContext, "Error: Passwords aren't the same", Toast.LENGTH_LONG)
                    println(t)
                    t.show()
                } else {
                    println("Tests Passed")
                    val t = Toast.makeText(applicationContext, "Your account is created, Welcome", Toast.LENGTH_LONG)
                    t.show()
                }
            }
    }
}
