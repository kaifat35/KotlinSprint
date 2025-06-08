package org.example.lesson_2

fun main(){
    val oldWorkers = 50
    val salaryOldWorker = 30000
    val newWorkers = 30
    val salaryNewWorker = 20000
    val totalSalaryOldWorkers = salaryOldWorker * oldWorkers
    val totalSalary = totalSalaryOldWorkers + (newWorkers * salaryNewWorker)
    val averageSalary = totalSalary / (oldWorkers + newWorkers)
    println(totalSalaryOldWorkers)
    println(totalSalary)
    println(averageSalary)
}