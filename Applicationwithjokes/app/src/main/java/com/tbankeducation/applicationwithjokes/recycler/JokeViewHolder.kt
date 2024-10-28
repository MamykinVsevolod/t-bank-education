package com.tbankeducation.applicationwithjokes.recycler

import androidx.recyclerview.widget.RecyclerView
import com.tbankeducation.applicationwithjokes.data.Joke
import com.tbankeducation.applicationwithjokes.databinding.JokeItemBinding

class JokeViewHolder(
    private val binding: JokeItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    // каждый viewHolder держит ссылку на конкретную view списка
    fun bind(joke: Joke) {
        binding.jokeCategory.text = joke.category
        binding.jokeQuestion.text = joke.question
        binding.jokeAnswer.text = joke.answer
    }
}