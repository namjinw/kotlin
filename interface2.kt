package com.example

interface flyable {
    fun fly()
}

interface swimmable {
    fun swim()
}

class Duck : flyable, swimmable {
    override fun swim() {
        println("오리가 헤엄쳐요~")
    }

    override fun fly() {
        println("오리가 날아요~")
    }
}

fun main() {
    val duck = Duck()
    duck.fly()
    duck.swim()
}