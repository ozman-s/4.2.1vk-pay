package ru.netology

fun main() {
    val amount = 3600000
    val percent = 75
    val minCommission = 3500
    val totalPercent = (amount * percent) / 10000

    val result = if(totalPercent < minCommission) minCommission else totalPercent
    println(if (amount <= minCommission) "Сумма перевода должна превышать 3500 копеек" else "Комиссия за перевод составит $result копеек")
}