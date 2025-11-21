package com.example

abstract class Shape () {
    abstract fun area(): Double
    fun description() = println("도형입니다.")
}

class Circle(var r: Int) : Shape() {
    override fun area(): Double {
        return 3.14 * r * r
    }
}

class Rectangle(var x: Double, var y: Double) : Shape() {
    override fun area(): Double {
        return x * y
    }
}

fun main() {
    var c = Circle(4)
    println(c.area())
    var R = Rectangle(1.6, 5.4)
    println(R.area())
}