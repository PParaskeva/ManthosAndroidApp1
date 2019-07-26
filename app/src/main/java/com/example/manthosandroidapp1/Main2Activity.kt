package com.example.manthosandroidapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.core.widget.addTextChangedListener
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val seaAndCloudUrl =
            "https://vignette.wikia.nocookie.net/onepiece/images/9/9b/Sea_Clouds_Infobox.png/revision/latest?cb=20181107064315"

        Picasso
            .get()
            .load(seaAndCloudUrl)
            .fit().centerCrop()
            .placeholder(R.drawable.placeholder)
            .into(backgroundImageView)

        loginButton?.setOnClickListener {
            val textSomething = usernameInput?.text?.toString()

            val intent = Intent(this,ResultActivity::class.java)

            intent.putExtra("MANTHOS_NAME",textSomething)

            startActivity(intent)
        }

        usernameInput?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {

            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0?.length ?: 0 > 5) {
                    loginButton?.isEnabled = true
                    loginButton?.alpha = 1F
                }
            }
        })

    }
}
