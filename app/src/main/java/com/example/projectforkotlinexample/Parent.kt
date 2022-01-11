package com.example.projectforkotlinexample

open class Parent(name: String, age: Int) {

    val name = name.trim()
    val age = age

    open fun printParentClassInfo(){
        println(name+ " "+ age.toString())
    }

    companion object{
        fun printHello() {
            println("Hello")
        }
    }
}