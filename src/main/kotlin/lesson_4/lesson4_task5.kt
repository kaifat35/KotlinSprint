package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISIONS = 50

fun main() {
    println(
        "Введите через пробел: наличие повреждений корпуса,\n" +
                "состав экипажа, количество ящиков с провизией,\n" +
                "благоприятность погоды."
    )
    val input = readln()
    val result = input.split(" ")
    val isDamaged = result[0].toBoolean()
    val crew = result[1].toInt()
    val provisions = result[2].toInt()
    val isWeatherGood = result[3].toBoolean()

    val isSwimming = (!isDamaged && crew in MIN_CREW..MAX_CREW &&
            provisions > MIN_PROVISIONS) ||
            (isDamaged && crew == MAX_CREW &&
                    provisions >= MIN_PROVISIONS && isWeatherGood)
    println("Корабль может отправиться в плавание: $isSwimming")
}