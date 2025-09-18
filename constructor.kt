package com.example

import kotlin.math.E

//class Person(val name: String?, var dge: Int?) // ? <= null 허용
//
//fun main() {
//    val lilian = Person("lilian", 17)
//    println("${lilian.name}은 ${lilian.dge}살")
//    lilian.dge = 18
//    println("${lilian.dge}살이 되었어!")
//
//    val nullname = Person(null, null)
//    println("${nullname.name}, ${nullname.dge}")
//}

//class school(var name: String, var num: Int = 0)
//
//fun main() {
//    val school1 = school("school1")
//    println("${school1.name}, ${school1.num}") // 이름, 기본값 0
//
//    val school2 = school("school2", 1)
//    println("${school2.name}, ${school2.num}")
//}

//class Email(var email: String?) {
//    init {
//        if (email.isNullOrBlank()) {
//            println("\"Email\"이 공백이거나 null이면 안됩니다.")
//        }
//        if (email?.contains("gmail.com") != true) {
//            println("\"Email\"이 이상합니다.")
//        } else {
//            println("$email, 이메일이 생성돼었습니다.")
//        }
//    }
//}
//
//fun main() {
//    val emails = Email("2025ninini@gmail.com")
//    println("${emails}")
//
//    val email3 = Email("2025ninini@gmail.co")
//    println("${email3}")
//
//    val emails1 = Email("")
//    println("${emails1}")
//
//    val emails2 = Email(null)
//    println("${emails2}")
//}

class schoolsmember (val name: String, val age: Int, var rank: String) {
    constructor(n: String, a: Int) : this(n, a, "외부인")

    override fun toString(): String {
        return if (rank != "외부인") {
            "${name}은 ${age}살이며, 직급은 ${rank}입니다."
        } else {
            "${name}은 ${age}살이며, 직급은 외부인입니다."
        }
    }
}

fun main() {
    val person1 = schoolsmember("이학생", 17, "학생")
    println(person1)

    val person2 = schoolsmember("김선생", 48, "교사")
    println(person2)

    val person3 = schoolsmember("이사람", 27)
    println(person3)
}