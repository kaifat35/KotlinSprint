package org.example.lesson_5

fun main() {
    val a = 2
    val b = 2
    print("Введи результат сложения: $a + $b = ")
    val input = readln().toInt()
    if (input == a + b) {
        print("Добро пожаловать!")
    } else {
        print("Доступ запрещен.")
    }
}
