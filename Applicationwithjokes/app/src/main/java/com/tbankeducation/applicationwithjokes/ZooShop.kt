package com.tbankeducation.applicationwithjokes

// --------Интерфейсы------------

// Интерфейс для животных, у которых есть базовые свойства: вес и возраст
interface Animal {
    val weight: Int
    val age: Int

    // Метод для получения характеристик животного
    fun describe(): String {
        return "Вес: $weight кг, Возраст: $age лет"
    }
}

// Перечисление для типов прикуса собак
enum class BiteType {
    STRAIGHT, OVERBITE, UNDERBITE
}

// Интерфейс для собак, с дополнительным свойством - тип прикуса
interface Dog : Animal {
    val bite: BiteType

    // Переопределяем метод описания, добавляя тип прикуса
    override fun describe(): String {
        return super.describe() + ", Прикус: $bite"
    }
}

// Перечисление для типов поведения кошек
enum class BehaviorType {
    ACTIVE, PASSIVE
}

// Интерфейс для кошек, с дополнительным свойством - тип поведения
interface Cat : Animal {
    val behavior: BehaviorType

    // Переопределяем метод описания, добавляя тип поведения
    override fun describe(): String {
        return super.describe() + ", Поведение: $behavior"
    }
}

// ------------Реализация интерфейсов-------

class Husky(
    override val weight: Int,
    override val age: Int,
    override val bite: BiteType
) : Dog

class Corgi(
    override val weight: Int,
    override val age: Int,
    override val bite: BiteType
) : Dog

class ScottishFold(
    override val weight: Int,
    override val age: Int,
    override val behavior: BehaviorType
) : Cat

class Siamese(
    override val weight: Int,
    override val age: Int,
    override val behavior: BehaviorType
) : Cat

