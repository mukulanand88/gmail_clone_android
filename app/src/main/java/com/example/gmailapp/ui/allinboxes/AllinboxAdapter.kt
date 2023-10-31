package com.example.gmailapp.ui.allinboxes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmailapp.databinding.ItemGmailBinding
import com.example.gmailapp.ui.allinboxes.model.Gmail

class AllinboxAdapter(private val listofGmail: List<Gmail>): RecyclerView.Adapter<AllinboxAdapter.AllInboxListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllInboxListViewHolder {
        return AllInboxListViewHolder(ItemGmailBinding.inflate(LayoutInflater.from(parent.context)))

    }

    override fun getItemCount(): Int {
       return listofGmail.size
    }

    override fun onBindViewHolder(holder: AllInboxListViewHolder, position: Int) {
            var gmail = listofGmail[position]
            holder.binding.imageTV.setImageResource(gmail.image)
            holder.binding.titleTV.text = gmail.title
            holder.binding.headTV.text = gmail.head
            holder.binding.contentTV.text = gmail.content

    }
    inner class AllInboxListViewHolder(var binding: ItemGmailBinding):
        RecyclerView.ViewHolder(binding.root)
}