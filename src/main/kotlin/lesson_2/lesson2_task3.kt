package org.example.lesson_2

const val MINUTES_IN_HOURS = 60

fun main(){
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTimeMinutes = 457
    val departureTotalMinutes = departureTimeHours * MINUTES_IN_HOURS + departureTimeMinutes + travelTimeMinutes
    val arrivalTimeHours = departureTotalMinutes / MINUTES_IN_HOURS
    val arrivalTimeMinutes = departureTotalMinutes % MINUTES_IN_HOURS
    println("$arrivalTimeHours:$arrivalTimeMinutes")
}