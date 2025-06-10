package org.example.lesson_3

fun main(){
    val userName = "Татьяна"
    val userPatronymic = "Сергеевна"
    var userSurname = "Андреева"
    var age = 20
    println("[$userSurname $userName $userPatronymic, $age]")
    userSurname = "Сидорова"
    age = 22
    println("[$userSurname $userName $userPatronymic, $age]")
}