package org.example.lesson_4

fun main() {
    val dayNow = 5
    val isTrainingDay = dayNow % 2 == 0
    println(
        """
        Упражнения для рук:    ${!isTrainingDay}
        Упражнения для ног:    $isTrainingDay
        Упражнения для спины:  $isTrainingDay
        Упражнения для пресса: ${!isTrainingDay}
    """.trimIndent()
    )
}