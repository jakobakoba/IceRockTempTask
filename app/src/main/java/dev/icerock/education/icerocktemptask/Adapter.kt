package dev.icerock.education.icerocktemptask

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dev.icerock.education.icerocktemptask.databinding.ItemLayoutBinding

class Adapter(
    private val onItemClick: (Contact) -> Unit
): RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    val contacts = listOf(
        Contact("John", "Doe", R.drawable.avatar1),
        Contact("Jane", "Smith", R.drawable.avatar2),
        Contact("Emily", "Brown", R.drawable.avatar3),
        Contact("Michael", "Johnson", R.drawable.avatar4),
        Contact("Sarah", "Davis", R.drawable.avatar5)
    )


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(contacts[position])
        holder.itemView.setOnClickListener { onItemClick(contacts[position]) }

    }

    override fun getItemCount(): Int = contacts.size

    class ItemViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(value: Contact) {
            binding.itemAvatar.setImageResource(value.avatarResourceId)
            binding.itemName.text = value.firstName
            binding.itemLastName.text = value.lastName
        }
    }
}
