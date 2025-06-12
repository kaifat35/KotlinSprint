package org.example.lesson_5

const val COEFFICIENT_CONVERTS_L100KM_IN_L1KM = 100

fun main() {
    println("Калькулятор топлива")
    print("Введите расстояние поездки (в километрах): ")
    val travelDistance = readln().toDouble()
    print("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toDouble()
    print("Введите текущую цену за литр топлива (в рублях):")
    val pricePerLiter = readln().toDouble()
    val totalFuel = (travelDistance * fuelConsumption) / COEFFICIENT_CONVERTS_L100KM_IN_L1KM
    val totalPrice = totalFuel * pricePerLiter
    println("Общее количество топлива: %.2f литров".format(totalFuel))
    println("Стоимость поездки: %.2f рублей".format(totalPrice))
}