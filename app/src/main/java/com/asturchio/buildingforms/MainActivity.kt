package com.asturchio.buildingforms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupSpinner()
        setupButton()

    }

    private fun setupSpinner(){
        val spinnerValues:  Array<String> = arrayOf("Mr.","Mrs", "Miss", "Mx", "Dr", "Prof")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, spinnerValues)

        spinner_title.adapter = spinnerAdapter
    }

    private fun setupButton(){
        button_preview.setOnClickListener {

            onPreviewClicked()
        }
    }
    private fun onPreviewClicked() {

        val message = Message(
            spinner_title.selectedItem?.toString(),
            edit_text_first_name.text.toString(),
            edit_text_last_name.text.toString(),
            edit_text_phone_number.text.toString(),
            edit_text_email.text.toString(),
            edit_text_password.text.toString(),
            edit_text_confirm_password.text.toString()
        )

        val previewActivityIntent = Intent(this, PreviewActivity::class.java)

        previewActivityIntent.putExtra("Message", message)
        startActivity(previewActivityIntent)


    }
}