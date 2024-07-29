package com.example.menufy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.menufy.databinding.PopularItemBinding

class PopularAdapter(
    private val items: List<String>,
    private val prices: List<String>,
    private val images: List<Int>
) : RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        val binding = PopularItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PopularViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        holder.bind(items[position], prices[position], images[position])
    }

    override fun getItemCount(): Int = items.size

    class PopularViewHolder(private val binding: PopularItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: String, price: String, image: Int) {
            binding.foodNamePopular.text = item
            binding.pricePopular.text = price
            binding.imagePopular.setImageResource(image)
        }
    }
}
