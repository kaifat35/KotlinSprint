package org.example.lesson_4

const val TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    val availabilityTablesToday = reservedTablesToday < TABLES
    val availabilityTablesTomorrow = reservedTablesTomorrow < TABLES
    println("Доступность столиков на сегодня: $availabilityTablesToday\n" +
            "Доступность столиков на завтра: $availabilityTablesTomorrow")
}