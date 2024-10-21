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
    override val age: Int
) : Dog {
    override val bite: BiteType = BiteType.OVERBITE
}

class Corgi(
    override val weight: Int,
    override val age: Int
) : Dog {
    override val bite: BiteType = BiteType.STRAIGHT
}

class ScottishFold(
    override val weight: Int,
    override val age: Int,
) : Cat {
    override val behavior: BehaviorType = BehaviorType.ACTIVE
}

class Siamese(
    override val weight: Int,
    override val age: Int,
) : Cat {
    override val behavior: BehaviorType = BehaviorType.PASSIVE
}

// ------------Класс магазина------------

class ZooShop {

    // Метод для определения породы животного и возврата её описания
    fun identifyBreed(animal: Animal): String {
        return when (animal) {
            is Husky -> "Собака: Хаски, ${animal.describe()}"
            is Corgi -> "Собака: Корги, ${animal.describe()}"
            is ScottishFold -> "Кошка: Шотландская вислоухая, ${animal.describe()}"
            is Siamese -> "Кошка: Сиамская, ${animal.describe()}"
            else -> "Неизвестная порода"
        }
    }
}

// ------------MAIN------------

fun main() {
    val petStore = ZooShop()

    val husky = Husky(weight = 23, age = 5)
    val corgi = Corgi(weight = 12, age = 3)
    val siamese = Siamese(weight = 8, age = 6)
    val scottishFold = ScottishFold(weight = 7, age = 4)


    // Вывод информации о породах
    println(petStore.identifyBreed(husky))
    println(petStore.identifyBreed(corgi))
    println(petStore.identifyBreed(siamese))
    println(petStore.identifyBreed(scottishFold))
}

