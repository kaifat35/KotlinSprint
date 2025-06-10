package org.example.lesson_4

const val SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true
const val PERCENT_AIR_HUMIDITY = 20
const val FORBIDDEN_SEASON = "winter"

fun main(){
    val sunnyWeather = true
    val outdoorAwning = true
    val airHumidity = 20
    val currentSeason = "winter"
    val conditionsFavorable = sunnyWeather == SUNNY_WEATHER &&
            outdoorAwning == OUTDOOR_AWNING &&
            airHumidity == PERCENT_AIR_HUMIDITY &&
            currentSeason != FORBIDDEN_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsFavorable")
}