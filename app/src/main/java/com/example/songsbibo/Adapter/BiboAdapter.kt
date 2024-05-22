package com.example.songsbibo.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.songsbibo.data.model.Song
import com.example.songsbibo.databinding.ListItemBinding

class BiboAdapter(
    private val dataset:List<Song>
): RecyclerView.Adapter<BiboAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val songs = dataset[position]
        holder.binding.textViewSongName.text = songs.name
        holder.binding.textViewInterpretName.text = songs.interpret
        holder.binding.textViewDauer.text = songs.dauer
    }

}