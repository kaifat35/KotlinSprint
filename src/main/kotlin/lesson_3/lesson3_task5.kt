package org.example.lesson_3

fun main(){
    val stroke = "D2-D4;0"
    val (wereFrom, where, strokeNumber) = stroke.split("-",";")
    println("$wereFrom\n$where\n$strokeNumber")
}