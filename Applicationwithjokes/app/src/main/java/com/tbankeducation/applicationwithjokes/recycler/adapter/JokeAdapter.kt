package com.tbankeducation.applicationwithjokes.recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tbankeducation.applicationwithjokes.data.Joke
import com.tbankeducation.applicationwithjokes.databinding.JokeItemBinding
import com.tbankeducation.applicationwithjokes.recycler.JokeViewHolder

class JokeAdapter : RecyclerView.Adapter<JokeViewHolder>() {

    private val data = listOf(
        Joke(
            category = "Программирование",
            question = "Почему программисты не делают комплименты?",
            answer = "Потому что у них нет интерфейса для выражения чувств!"
        ),
        Joke(
            category = "Программирование",
            question = "Как программисты ищут свою вторую половинку?",
            answer = "Они запускают поиск: ‘WHERE is love’."
        ),
        Joke(
            category = "Наука",
            question = "Почему химики не играют в шахматы?",
            answer = "Потому что они всегда перемешивают все фигуры."
        ),
        Joke(
            category = "Наука",
            question = "Почему физики не танцуют?",
            answer = "Потому что они постоянно ищут точку равновесия!"
        ),
        Joke(
            category = "Еда",
            question = "Почему картошка фри всегда шепчет секреты?",
            answer = "Потому что она любит быть в соусе!"
        ),
        Joke(
            category = "Еда",
            question = "Что сказал бургер булочке на свидании?",
            answer = "«Ты меня дополнишь!»"
        ),
        Joke(
            category = "Спорт",
            question = "Почему пловцы всегда такие пунктуальные?",
            answer = "Потому что им не хочется плавать против течения!"
        )
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = JokeItemBinding.inflate(inflater, parent, false)

        return JokeViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    // вызывается при скроллинге
    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.bind(data[position])
    }
}