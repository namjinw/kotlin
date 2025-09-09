package com.example

fun numb(number: Int) { // 짝수판별출력
    if (number % 2 == 0) {
        println("$number <= 짝수")
    }
    else {
        println("$number <= 홀수")
    }
}

fun listminmax(numlists: List<Int>) { // 배열은 List <데이터타입>
    println("최솟값: " + numlists.minOrNull())
    println("최댓값: " + numlists.maxOrNull())
}

fun show(name: String = "누구", age: Int = 17) {
    println(name + "님의 나이는 " + age + "살 입니다.")
}

fun num3(i: Int) = i * i * i // 단일 표현식 함수 => 한줄

fun main() {
    println("숫자를 입력하세요: ")
    var num = readLine()!!.toInt()
    numb(num)

    println("숫자5개를 입력하세요: ")
    var numlist = mutableListOf<Int>()
    for (i in 1..5) {
        println("$i 번째 수: ")
        var numli = readLine()!!.toInt()
        numlist.add(numli)
    }
    listminmax(numlist)

    println("이름을 입력하시오: ")
    var name = readLine()!!.toString()
    println("나이를 입력하시오: ")
    var age = readLine()!!.toInt()
    show(name, age)

    println(num3(4))
}