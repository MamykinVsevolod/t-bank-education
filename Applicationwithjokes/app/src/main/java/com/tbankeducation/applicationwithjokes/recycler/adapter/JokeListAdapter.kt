package com.tbankeducation.applicationwithjokes.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.tbankeducation.applicationwithjokes.data.Joke
import com.tbankeducation.applicationwithjokes.databinding.JokeItemBinding
import com.tbankeducation.applicationwithjokes.recycler.JokeViewHolder
import com.tbankeducation.applicationwithjokes.recycler.util.JokeItemDiffCallback

class JokeListAdapter(
    itemCallback: JokeItemDiffCallback
) : ListAdapter<Joke, JokeViewHolder>(itemCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = JokeItemBinding.inflate(inflater, parent, false)

        return JokeViewHolder(binding)
    }

    override fun getItemCount(): Int = currentList.size

    // вызывается при скроллинге
    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bind(currentList[position])
    }
}