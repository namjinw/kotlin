package com.example

fun main() {
//    var friends = listOf<Any>("철수", 1, "영의", " 제임스")
//    var friends = listOf<String>("철수", "영의", " 제임스")
    var friends = mutableListOf<String>("철수", "영의", "제임스")

//    val friend = friends.get(0)
//    val friend = friends[0]
//    val friend = friends.first()
    val friend = friends.last()

    println(friend)

    friends[0] = "이이호"
    println(friends)

    val mynumber = arrayOf(1,2,3,4)
    mynumber[2] = 6
    println(mynumber.contentToString())
}