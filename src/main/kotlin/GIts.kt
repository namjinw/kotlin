package com.example

fun main() {
    println("hello")

//    var myName: String? = null
    var myName: String? = "이이호"

    if (myName != null) {
        println("myName: ${myName} - 데이터 없음")
    }
    else {
        println("MyName: ${myName}")
    }

//    var nullname: String = if (myName == null) "데이터 없음" else myName
    var nullname: String = myName ?: "이름없음"
    println(nullname)

    val othername : String = myName.let {
        it + " - 데이터 존재"
    }?: "이름없음"
    println(othername)
}