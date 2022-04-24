package com.asturchio.buildingforms

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    private lateinit var message: Message
    private lateinit var messagePreviewText: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        displayMessage()

    }



    private fun displayMessage() {
        message = intent.getSerializableExtra("Message") as Message
        messagePreviewText = """
            Please confirm your information:
            
            Title: ${message.title}
            
            First Name: ${message.firstName}
            
            Last Name: ${message.lastName}
            
            Phone Number: ${message.phoneNumber}
            
            Email: ${message.email}
            
            
        """.trimIndent()

        text_view_message.text=messagePreviewText
    }


}