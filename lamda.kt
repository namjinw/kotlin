package com.example

fun main() {
//    val sum = { a: Int, b: Int -> a + b} // 왼쪽 a: Int, b: Int (매개변수 자리 ) -> a + b (처리 되는 부분)
//    println(sum(4, 5))

//    val square: (Int) -> Int = { it * it } // : (Int) 매개변수 근데 하나여서 그냥 매개변수의 데이터 타입 => it이 대체
//    println(square(3)) // -> Int = { it * it } 정수형으로 반환

//    val members = listOf<Int>(1, 2, 3, 4, 5)
//
//    val evennum = members.filter { it % 2 == 0 } // filter: 조건이 참이면 남기고, 아니면 버려 (대신반복문)
//    println(evennum) // 2, 4
//
//    val squarenum = members.map { it * it }
//    println(squarenum)

//    fun operate(a: Int, b: Int, opertation: (Int, Int) -> Int): Int { // opertation은 (매개변수) -> (람다식 X) 데이터 타입만 ① operate의 매개변수 a, b를
//        return opertation(a, b) // ② opertation에 매개변수값, 람다식 넣어서 실행
//    }
//
//    val result = operate(5, 10) { x, y -> x * y}
//    println(result)

//    fun makeMultiplier(factor: Int): (Int) -> Int { // factor 정수형 매개변수를 입력 (Int)정수형으로 반환하는 함수 -> Int 반환
//        return { number -> number * factor }
//    }
//
//    val double = makeMultiplier(2) // return 람다식을 저장 { number -> number * factor } = { number -> number * 2 }
//    val triple = makeMultiplier(3) // return 람다식을 저장 { number -> number * factor } = { number -> number * 3 }
//
//    println(double(5)) // 람다식의 number에 5 => { number -> number(5) * factor(2)
//    println(triple(5)) // 람다식의 number에 5 => { number -> number(5) * factor(3)

//    val isAdult: (Int) -> Boolean = { age -> age >= 18 } // 정수형 매개변수를 받아 조건식함수로 반환
//    println(isAdult(20)) // { age -> 20 >= 18 }
//    println(isAdult(14)) // { age -> 14 >= 18 }

//    val names = listOf<String>("alice", "jonese", "mikeff", "kimginf")
//    val sortnames = names.sortedBy { it.length } // sortedBy <= 일정한 기준으로 정렬 sorted <= 그냥 정렬
//    println(sortnames) // sortedByDescending <= 일정한 기준으로 내림차 정렬 sortedDescending <= 그냥 내림차

    data class Person(val name: String, var age: Int)

    val person = Person("john", 25).apply {
        age += 1
        println("Updata age: ${age}")
    }

    val hellolength = "Hello".let { it.length }
    println(hellolength)
}