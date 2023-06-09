package com.example.contacts


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts.databinding.ContactListBinding
import com.squareup.picasso.Picasso

class ContactsRVAdapter(var contactList: List<ContactData>): RecyclerView.Adapter<ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ContactListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contactsDetails = contactList[position]
        holder.contacts.apply {
            tvName.text=contactsDetails.name
            tvEmail.text=contactsDetails.email
            tvNumber.text=contactsDetails.phoneNumber
            Picasso
                .get()
                .load(contactsDetails.image)
                .resize(80,80)
                .centerCrop()
                .into(holder.contacts.imageView4)

        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactViewHolder(var  contacts: ContactListBinding): RecyclerView.ViewHolder(contacts.root){

}
//class ContactViewHolder(var contacts: ): RecyclerView.ViewHolder(binding.root)







