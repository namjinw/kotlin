package com.example

fun main() {
    for (i in 1..10) { // 출력
        println(i)
    }
    for (i in 10 downTo 1) { //역방향 출력
        println(i)
    }
    println("숫자 5개를 입력하시오.")
    val numlist = mutableListOf<Int>() // 배열 int값만

    for (i in 1..5) { // 5번실행
        println("$i 번째 숫자: ")
        var num = readLine()!!.toInt() // 정수만 입력
        numlist.add(num) // 배열에 넣기
    }

    println("입력한 숫자: $numlist")

    var y = 1
    while (y <= 5) {
        println(y)
        y++
    }

    for (i in 2..10 step 2) {
        println(i)
    }

    for (i in 1..10) { // if문 넣기
        if (i % 2 == 0) {
            println("$i 짝수")
        }
        else {
            println(i)
        }
    }
}