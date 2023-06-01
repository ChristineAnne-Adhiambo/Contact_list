package com.example.contacts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        var contact1 = ContactData("Rose", "+254786123432",
            "roseanyango@gmail.com", "Rose")
        var contact2 = ContactData("Shellyne Mellyne", "+254723467654",
            "shellynemellyne@gmail.com", "Shellyne")
        var contact3 = ContactData("Mitch Odede", "+2547123400076",
            "mitch@gmail.com", "Mitch")
        var contact4 = ContactData("Nova Blessings", "+254709123459",
            "novablessings@gmail.com", "Nova")
        var contact5 = ContactData("Noel Favour", "+254753456784",
            "noelfavour@gmail.com", "Noel")
        var contact6 = ContactData("Israel Hazel", "+254769681011",
            "israelhazel@gmail.com", "Israel")
        var contact7 = ContactData("Anne Christine", "+254787654876",
            "annechristine@gmail.com", "TinTin")
        var contact8 = ContactData("Wayne Balala", "+25470987654",
            "waynebalala@gmail.com", "Wayne")


        var contactLists = listOf<ContactData>(contact1, contact2, contact3, contact4, contact5,
            contact6, contact7, contact8)


        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var adapterContacts = ContactsRVAdapter(contactLists)
        binding.rvContacts.adapter = adapterContacts
    }
}