package com.example

fun main() {
    println("hello")

    var myName: String? = null

    if (myName != null) {
        println("myName: ${myName} - 데이터 없음")
    }
    else {
        println("MyName: ${myName}")
    }
}