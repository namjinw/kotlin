package com.example

fun main() {
    println("나이를 입력하시오: ")
    var age = readLine()!!.toInt()
    if (age > 20) {
        println("성인입니다.")
    }
    else {
         println("미성년자 입니다.")
    }
    
    println("숫자를 입력하시오")
    var num = readLine()!!.toInt()
    when (num % 2) {
        0 -> println("짝수입니다.")
        1 -> println("홀수입니다.")
        else -> println("숫자오류")
    }

    println("점수를 입력하시오")
    var score = readLine()!!.toInt()
    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}