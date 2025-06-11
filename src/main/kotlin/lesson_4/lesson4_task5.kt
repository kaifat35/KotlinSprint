package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50

fun main() {
    val input = readLine() ?: return
    val result = input.split(" ")
    val isDamage = result[0].toBoolean()
    val crew = result[1].toInt()
    val provisions = result[2].toInt()
    val isWeatherConditions = result[3].toBoolean()

    val isSwimming = (!isDamage && crew in MIN_CREW..MAX_CREW &&
            provisions > MIN_PROVISIONS) ||
            (isDamage && crew == MAX_CREW &&
                    provisions >= MIN_PROVISIONS && isWeatherConditions)
    println("Корабль может отправиться в плавание: $isSwimming")
}