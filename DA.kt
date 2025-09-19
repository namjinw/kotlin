package com.example

import java.sql.DriverManager

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver")

    val urs = "jdbc:mysql://localhost:3306/kotlin"
    val id = "root"
    val ps = "Pkea0812@"

    val conn = DriverManager.getConnection(urs, id, ps)

    fun login(userid: String, userpassword: String): Boolean {
        val sql = "select userpass from kotlinuser where userid = ?"
        val pstmt = conn.prepareStatement(sql)
        pstmt.setString(1, userid)
        val rs = pstmt.executeQuery()

        if (rs.next()) {
            val daps = rs.getString("userpass")
            return daps == userpassword
        }
        else {
            return false
        }
        rs.close()
        conn.close()
        pstmt.close()
    }

    println("로그인 성공? : ${login("jini", "1234")}")
    println("로그인 성공? : ${login("jini", "0000")}")
}