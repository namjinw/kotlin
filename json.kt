package com.example

import  kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class User (
    val id: Int,
    val name: String,
    val password: String,
    val email: String,
    val joindate: String
)

fun main() {
    val file = File("src/user.json")

    val users: MutableList<User> = Json.decodeFromString(file.readText())

    while (true) {
        println("\n=== 메뉴 ===")
        println("1. 로그인")
        println("2. 회원가입")
        println("3. 전체 유저 보기")
        println("0. 종료")
        println("선택: ")

        when(readLine()?.trim()) {
            "1" -> login(users)
            "2" -> println("기능 안만듬")
            "3" -> users.forEach { println(it) }
            "0" -> {
                println("-종료-")
                return
            }
            else ->  println("예외발생 숫자를 제대로 입력하십시오")
        }
    }
}

fun login(user: List<User>) {
    println("이름을 입력하시오.")
    val username = readLine()?.trim().orEmpty()
    println("비밀번호를 입력하시오.")
    val userpass = readLine()?.trim().orEmpty()

    val userinfo = user.find { it.name == username && it.password == userpass }
    if (userinfo != null) {
        println("로그인 성공! 환영합니다, ${userinfo.name}님.")
    }
    else {
        println("이름 또는 비밀번호가 틀렸습니다.")
    }
}
