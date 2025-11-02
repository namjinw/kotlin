package com.example

fun main() {
    var friends = listOf<String>("철수", "영희", "짱구", "제임스", "빌리")

    for ((index, friend) in friends.withIndex()) {
        println("index: ${index}, friend: ${friend}")
    }

    for (friend in friends) {
        println(friend)
    }
}