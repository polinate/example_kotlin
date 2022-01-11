package com.example.projectforkotlinexample

interface Movable{
    var speed: Int
    fun move()
    fun stop(){
        println("Остановка")
    }
}