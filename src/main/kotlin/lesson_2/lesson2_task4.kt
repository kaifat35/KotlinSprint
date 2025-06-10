package org.example.lesson_2

const val BUFF_PERCENT = 20
const val TOTAL_PERCENT = 100

fun main(){
    val ironOre = 11
    val crystalOre = 7
    val ironOreBuff = ironOre * BUFF_PERCENT / TOTAL_PERCENT
    val crystalOreBuff = crystalOre * BUFF_PERCENT / TOTAL_PERCENT
    println("Iron Ore Buff: $ironOreBuff")
    println("Crystal Ore Buff: $crystalOreBuff")
}