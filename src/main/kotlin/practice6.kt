package com.example

class Rectangles(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

fun main() {
    fun f(x: Int): Int = x * x // y = x^2

    val domain = (-5..5).toList() // 집합 X는 -5부터 5까지
    val codomain = (0..25).toList() // 집합 Y는 0부터 25까지

    val range = domain.map { f(it) } // 치역은 x * x의 값

    println("정의역: $domain")
    println("공역: $codomain")
    println("치역: $range")

    val e1 = Rectangles(height = 30, width = 30)
    println(e1.isSquare)
}

