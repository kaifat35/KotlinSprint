package org.example.lesson_4

const val DAY_START = 1

fun main(){
    val dayNow = 5
    val trainingArmsPress = dayNow % 2 == DAY_START
    val trainingLegsBack = !trainingArmsPress
    println("""
        Упражнения для рук:    $trainingArmsPress
        Упражнения для ног:    $trainingLegsBack
        Упражнения для спины:  $trainingLegsBack
        Упражнения для пресса: $trainingArmsPress
    """.trimIndent())
}