package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val inputSumUser = 70000
    val interestRate = 0.167
    val depositTimeOld = 20
    val totalAmount = inputSumUser * (1 + interestRate / 1).pow(depositTimeOld)
    println("%.3f".format(totalAmount))
}