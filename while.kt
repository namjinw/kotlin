package com.example

fun main() {
    var i = 1
    while (i <= 5) { // 조건 검사 후 실행
        println(i)
        i++
    }

    var x = 1
    do { // 실행 후 조건 검사
        println(x)
        x++
    } while (x <= 5)
}