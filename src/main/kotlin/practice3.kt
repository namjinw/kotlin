package com.example

open class Person(var name: String, var age: Int) {
    open fun introduce(name: String, age: Int) {
        println("name: ${name}, age: ${age}")
    }
}

class Student(name: String, age: Int, var grade: Int) : Person(name = name, age = age) {

    override fun introduce(name: String, age: Int) {
        super.introduce(name, age)
        println("grade: ${grade}")
    }
}
fun main() {
    val s = Student("jini", 18, 2)
    s.introduce("jini", 18)
}