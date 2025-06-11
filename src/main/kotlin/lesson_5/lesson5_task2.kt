package org.example.lesson_5

const val AGE = 18
const val CURRENT_YEAR = 2025

fun main() {
    println("Введите свой год рождения:")
    val input = readln().toInt()
    if (CURRENT_YEAR - input >= AGE) {
        print("Показать экран со скрытым контентом.")
    } else {
        print("Доступ запрещен.")
    }
}