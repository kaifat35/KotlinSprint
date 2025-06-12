package org.example.lesson_5

fun main() {
    val firstNumber = 2
    val secondNumber = 2
    print("Введи результат сложения: $firstNumber + $secondNumber = ")
    val input = readln().toInt()
    if (input == firstNumber + secondNumber) {
        print("Добро пожаловать!")
    } else {
        print("Доступ запрещен.")
    }
}
