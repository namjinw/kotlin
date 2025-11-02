package com.example

fun main() {
    fun MyHello() {
        println("안녕하세요")
    }
    MyHello()

    fun MyHelloProfile(name: String) {
        println("안녕하세요 ${name}님!")
    }
    MyHelloProfile("김철수")

    fun MyHelloReturn(): String {
        return "이철수"
    }
    val names = MyHelloReturn()
    println(MyHelloReturn())
    println(names)
}