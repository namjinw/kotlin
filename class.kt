package com.example

class Car {
    var brand = ""
    var color = ""

    fun drive() {
        println("$brand, car is  driving")
    }
}

fun main() {
    val BMWcar = Car()
    BMWcar.brand = "BMW"
    BMWcar.color = "Red"
    BMWcar.drive()

    val Audi = Car()
    Audi.brand = "Audi"
    Audi.color = "blue"
    Audi.drive()
}