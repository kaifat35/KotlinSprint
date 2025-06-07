package org.example.lesson_1

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / 3600
    val remainingSeconds = totalSeconds % 3600
    val minutes = remainingSeconds / 60
    val seconds = remainingSeconds % 60
    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}