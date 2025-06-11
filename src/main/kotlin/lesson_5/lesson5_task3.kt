package org.example.lesson_5

const val NUMBER1 = 7
const val NUMBER2 = 15

fun main() {
    println("Угадайте два числа от 0 до 42 (введите через пробел):")
    val input = readln().split(" ")
    val num1 = input[0].toInt()
    val num2 = input[1].toInt()
    if ((num1 == NUMBER1 && num2 == NUMBER2) || (num1 == NUMBER2 && num2 == NUMBER1)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (num1 == NUMBER1 || num2 == NUMBER2 || num2 == NUMBER1 || num1 == NUMBER2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Правильные числа: $NUMBER1 и $NUMBER2")
}