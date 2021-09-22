package edu.temple.signupform

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
        val saveButt = findViewById<Button>(R.id.saveButton)

        val ocl = View.OnClickListener {
            var name: String = nameI.text.toString()
            var email: String = emailI.text.toString()
            var password: String = passwordI.text.toString()
            var passConf: String = passConfI.text.toString()
            if (name == "" || email == "" || password == "" || passConf == "") {
                var t = Toast.makeText(this@FormActivity, "Please fill out all boxes", Toast.LENGTH_SHORT)
                t.show()
            } else if (password != passConf) {
                var t = Toast.makeText(this@FormActivity, "Error: Passwords aren't the same", Toast.LENGTH_SHORT)
                t.show()
            } else {
                var t = Toast.makeText(this@FormActivity, "Your info is saved", Toast.LENGTH_SHORT)
                t.show()
            }
        }

        saveButt.setOnClickListener(ocl);
    }
}
