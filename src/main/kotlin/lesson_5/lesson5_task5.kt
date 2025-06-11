package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val randomNumbers = List(3) { Random.nextInt(0, 43) }
    println("Угадайте три числа от 0 до 42 (введите через пробел):")
    val inputUser = readln().split(" ").map { it.toInt() }
    val matchedNumbers = randomNumbers.intersect(inputUser).size
    when (matchedNumbers) {
        3 -> println("Поздравляем! Вы выиграли джекпот.")
        2 -> println("Поздравляем! Вы выиграли крупный приз.")
        1 -> println("Поздравляем! Вы выиграли утешительный приз.")
        else -> println("К сожалению не угадали ни одного числа.")
    }
    println("Выигрышные числа: $randomNumbers")
}