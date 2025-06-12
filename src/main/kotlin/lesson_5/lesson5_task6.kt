package org.example.lesson_5

const val CM_IN_METER = 100

fun main() {
    println("Калькулятор индекса массы тела (ИМТ)")
    print("Введите ваш вес в килограммах: ")
    val weight = readln().toDouble()
    print("Введите ваш рост в сантиметрах: ")
    val height = readln().toDouble() / CM_IN_METER
    val bmi = weight / (height * height)
    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25 -> "Нормальная масса тела"
        bmi < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Ваш ИМТ: %.2f".format(bmi))
    println("Категория веса: $category")
}