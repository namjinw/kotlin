package com.example

fun main() {
//    val NameandAge = mapOf<String, Int>("철수" to 16, "영희" to 17)
//    val NameandAge = mapOf<String, Int>(Pair("철수",16), Pair("영희", 17))
    val NameandAge = mutableMapOf<String, Int>(Pair("철수",16), Pair("영희", 17))

    NameandAge.put("주현", 19)
    NameandAge["주현"] = 20

    val keys = NameandAge.keys
    val values = NameandAge.values

    println(keys)
    println(values)

    println(NameandAge)
}