package org.example.lesson_1

const val SECONDS_IN_MINUTES = 60
const val SECONDS_IN_HOURS = 3600

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / SECONDS_IN_HOURS
    val remainingSeconds = totalSeconds % SECONDS_IN_HOURS
    val minutes = remainingSeconds / SECONDS_IN_MINUTES
    val seconds = remainingSeconds % SECONDS_IN_MINUTES
    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}