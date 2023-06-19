package com.example.contacts

import android.content.Intent
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

        binding.floatingbtn.setOnClickListener{
            val intent = Intent (this,addContact::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        displayContacts()
    }

    fun displayContacts(){
        var contact1 = ContactData("https://i.pinimg.com/236x/8a/15/f5/8a15f59de39eda094573caf088c50dac.jpg", "+254786123432",
            "roseanyango@gmail.com", "Rose")
        var contact2 = ContactData("https://i.pinimg.com/236x/ef/46/6d/ef466db84b5a883e3b910a71deaab59d.jpg", "+254723467654",
            "shellynemellyne@gmail.com", "Shellyne")
        var contact3 = ContactData("https://i.pinimg.com/236x/dc/d3/f7/dcd3f7c9731986685b603f7546e30cff.jpg", "+2547123400076",
            "mitch@gmail.com", "Mitch")
        var contact4 = ContactData("https://i.pinimg.com/236x/68/99/7d/68997d5898db2dbcc859c2508a123ffb.jpg", "+254709123459",
            "novablessings@gmail.com", "Nova")
        var contact5 = ContactData("https://i.pinimg.com/236x/e3/a7/6d/e3a76d17842665543b46484291781eae.jpg", "+254753456784",
            "noelfavour@gmail.com", "Noel")
        var contact6 = ContactData("https://i.pinimg.com/236x/bc/50/8d/bc508d8019a4cf121316516757ae66f8.jpg", "+254769681011",
            "israelhazel@gmail.com", "Israel")
        var contact7 = ContactData("https://i.pinimg.com/236x/ca/85/4d/ca854d69329e452a2f392733ad761d82.jpg", "+254787654876",
            "annechristine@gmail.com", "TinTin")
        var contact8 = ContactData("https://i.pinimg.com/236x/80/b1/49/80b14905c6d93dca1ea5ab0ac492c7ef.jpg", "+25470987654",
            "waynebalala@gmail.com", "Wayne")


        var contactLists = listOf<ContactData>(contact1, contact2, contact3, contact4, contact5,
            contact6, contact7, contact8)


        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        var adapterContacts = ContactsRVAdapter(contactLists)
        binding.rvContacts.adapter = adapterContacts
    }
}