package org.example.lesson_2

import kotlin.math.pow

fun main(){
    val inputSumUser = 70000
    val interestRate = 16.7
    val totalRate = 100
    val depositTimeOld = 20
    val totalAmount = inputSumUser * (1 + interestRate / totalRate * 1).pow(depositTimeOld)
    println("%.3f".format(totalAmount))
}