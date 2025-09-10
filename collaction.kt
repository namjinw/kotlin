package com.example

fun main() {
    val fruits = listOf<String>("바나나", "사과", "딸기")
    println(fruits[0])

    for (fruit in fruits) {
        println(fruit)
    }

    for (fruit in fruits.reversed()) {
        println(fruit)
    }

    for ((index, fruit) in fruits.withIndex()) { // withIndex 인덱스값과 함께 가져오기
        println("$index : $fruit")
    }

    for ((index, fruit) in fruits.reversed().withIndex()) { // 0 : 딸기, 1 : 사과, 2 : 바나나 <=  역순환
        println("$index : $fruit")
    }

    for (i in fruits.indices.reversed()) { // 2 : 딸기, 1 : 사과, 0 : 바나나 <= 번지값 유지하면서 역순환
        println("$i : ${fruits[i]}")
    }
}