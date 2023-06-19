package com.example.contacts

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.contacts.databinding.ActivityAddContactBinding

class addContact : AppCompatActivity() {
    lateinit var binding: ActivityAddContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSave.setOnClickListener {
            val intent =Intent(this,addContact::class.java)
            startActivity(intent)
        }

    }


    override fun onResume() {
        super.onResume()
        checkError()
        validateContacts()
    }

    fun checkError(){

        binding.tiefirstName.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilfirstName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )

        binding.tielastName.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tillastName.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.tiephoneNumber.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilphoneNumber.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
        binding.tieEmail.addTextChangedListener ( object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.tilEmail.error = null
            }

            override fun afterTextChanged(s: Editable?) {

            }
        } )
    }
    fun validateContacts(){
        val name =binding. tiefirstName.text.toString()
        val contacts = binding.tielastName.text.toString()

        val email =binding. tieEmail.text.toString()

        var error = false
        if (name.isBlank()){
            binding. tiefirstName.error = "name is required"
            error = true
        }

        if (name.isBlank()){
            binding. tielastName.error = "name is required"
            error = true
        }

        if (contacts.isBlank()){
            binding.tiephoneNumber.error = "contacts is required"
            error = true
        }

        if (email.isBlank()){
            binding.tieEmail.error = "Email is required"
            error = true
        }


        if (!error){
            Toast.makeText(this,"$name,$contacts, $email", Toast.LENGTH_LONG).show()
        }

    }















}