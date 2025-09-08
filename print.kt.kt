package com.example

import kotlin.math.max
import kotlin.math.min

fun main() {
    val i = 10
    val j = 20
    val str = "I love Kotlin"
    val str1 = " and I will make the kotlin"
    val str2 = "i/know/kotlin"
    println(max(i, j))
    println(min(i, j))
    println(str.uppercase())
    println(str.lowercase())
    println(str.length)
    for (i in str2.split("/")) {
        println(i)
    }
    println(str.trim())
    println(str1.replace("I", "you"))
    println(str2.reversed())
    println(str.contains("love"))
    println(str.contains("you"))
}