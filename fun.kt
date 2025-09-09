package com.example

fun add(a: Int, b: Int): Int{ // 매개변수 a < 정수, b < 정수 반환값 < 정수
    return a + b
}

//fun sayHello(name: String): Unit{ // Unit => void랑 같다
//    println("안녕하세요! $name 님!")
//}

fun sayHello(name: String = "손님") { // 매개변수 기본값 = 손님
    println("안녕하세요 $name 님")
}

fun square(x: Int, y: Int) =  x * y // 한줄이라면 = (코드)

fun main() {
    println(add(5, 10))
    sayHello("정원")
    sayHello()
    println(square(4, 5))
}