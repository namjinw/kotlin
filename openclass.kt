package com.example

//open class Animal(val name: String) {
////    fun eat() {
////        println("${name} is eating.")
////    }
////}
////
////class Dog(name: String) : Animal(name) {
////    fun bark() {
////        println("${name} is barking.")
////    }
////}
////
////fun main() {
////    val dog = Dog("춘식")
////    dog.eat()
////    dog.bark()
////}

//open class Animal(val name: String) {
//    open fun makeSound() {
//        println("${name}이 울음소리를 냅니다.")
//    }
//}
//
//class Dog (name: String) : Animal(name) {
//    override fun makeSound() {
//        println("${name}이 말함: Woof!")
//    }
//}
//
//fun main() {
//    val dog = Dog("춘식")
//    dog.makeSound()
//}

open class Animal(val name: String) {
    open fun move() {
        println("${name} is moving")
    }
}

class Bird(name: String) : Animal(name) {
    override fun move() {
        println("${name} is flying")
    }
}

class Fish(name: String) : Animal(name) {
    override fun move() {
        println("${name} is swimming")
    }
}

fun main() {
    val dog = Bird("춘식")
    dog.move()

    val fish = Fish("금붕어")
    fish.move()
}