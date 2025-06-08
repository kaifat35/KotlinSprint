package org.example.lesson_2

const val NUMBER_OF_STUDENTS = 4

fun main(){
    val studentsScore = listOf(3,4,3,5)
    val averageScore = studentsScore.sum().toFloat()/NUMBER_OF_STUDENTS
    println(averageScore)
}