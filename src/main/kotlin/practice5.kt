package com.example

interface Clickable {
    fun click()
}

interface Draggable {
    fun drag()
}

open class UIComponent(val id: Int) {
    open fun render() {
        println("컴포넌트 랜더링")
    }
}

class Button(id: Int) : UIComponent(id), Clickable, Draggable {
    override fun click() {
        println("버튼 클릭됨")
    }

    override fun drag() {
        println("드래그함")
    }

    override fun render() {
        println("버튼 랜더링")
    }
}

fun main() {
    val btn = Button(1)
    btn.click()
    btn.drag()
    btn.render()
}

