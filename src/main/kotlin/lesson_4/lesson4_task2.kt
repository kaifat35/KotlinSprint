package org.example.lesson_4

const val WEIGHT_MIN_AVERAGE = 36
const val WEIGHT_MAX_AVERAGE = 100
const val VOLUME_MIN_AVERAGE = 0
const val VOLUME_MAX_AVERAGE = 99

fun main(){
    val weightCargo1= 20
    val volumeCargo1 = 80
    val weightCargo2= 50
    val volumeCargo2 = 100

    println("Груз с весом $weightCargo1 кг и объемом $volumeCargo1 л соответствует категории 'Average':" +
            " ${WEIGHT_MIN_AVERAGE <= weightCargo1 && weightCargo1 <= WEIGHT_MAX_AVERAGE 
                    && VOLUME_MIN_AVERAGE <= volumeCargo1 && volumeCargo1 <= VOLUME_MAX_AVERAGE}")
    println("Груз с весом $weightCargo2 кг и объемом $volumeCargo2 л соответствует категории 'Average':" +
            " ${WEIGHT_MIN_AVERAGE <= weightCargo2 && weightCargo2 <= WEIGHT_MAX_AVERAGE
                    && VOLUME_MIN_AVERAGE <= volumeCargo2 && volumeCargo2 <= VOLUME_MAX_AVERAGE}")
}