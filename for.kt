package com.example

fun main() {
    var list = listOf(12, 13, 14, 15, 16)
    for (i in list) { // list내 i 번지 출력
        println(i)
    }

    for (i in 1..5 ) { // .. <= 조건 범위
        println(i)
    }

    for (i in 5 downTo 1) { // 5 => 1까지 감소
        println(i)
    }

    for (i in 0..10 step 2) { // 2만큼 이동
        println(i)
    }
}