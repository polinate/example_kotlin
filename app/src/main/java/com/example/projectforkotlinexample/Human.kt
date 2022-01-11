package com.example.projectforkotlinexample

abstract class Human(val name: String){

    abstract var age: Int

    fun hello(){
        println("My name is $name")
    }
}