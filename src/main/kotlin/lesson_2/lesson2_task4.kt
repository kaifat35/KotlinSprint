package org.example.lesson_2

const val BUFF = 0.2

fun main(){
    val ironOre = 11
    val crystalOre = 7
    val ironOreBuff = (ironOre * BUFF).toInt()
    val crystalOreBuff = (crystalOre * BUFF).toInt()
    println("Iron Ore Buff: $ironOreBuff")
    println("Crystal Ore Buff: $crystalOreBuff")
}