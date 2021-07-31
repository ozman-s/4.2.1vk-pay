package ru.netology

fun main() {
    val amaunt = 100_585.00
    val percent = 0.75
    val minCommission = 35.00
    val totalPercent = (amaunt * 0.75) / 100

    val result = if(totalPercent < minCommission) minCommission else totalPercent
    println("The total commission: $result")
}