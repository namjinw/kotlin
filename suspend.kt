package com.example

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun task1() {
    delay(1000)
    println("task1출력 완료")
}

suspend fun task2() {
    delay(1000)
    println("task2출력 완료")
}

fun main() = runBlocking { // suspend fun <= 순차실행
//    println(task1())
//    println(task2())
    val job1 = launch { task1() } // launch 동시 처리
    val job2 = launch { task2() }
    println(job1)
    println(job2)
}