package com.example.projectforkotlinexample

class Car : Movable{

    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }


}