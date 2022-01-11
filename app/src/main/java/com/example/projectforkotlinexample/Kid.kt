package com.example.projectforkotlinexample

import androidx.core.app.Person

class Kid(name: String, age: Int): Parent(name, age){

    fun printKidClassAge() {
        println(age.toString())
    }

    override fun printParentClassInfo() {
        println(age.toString()+ " " + name)
    }

    fun getFutureAge(value: Int): Int {
        return (age + value)
    }

    fun getFutureAge(value: Double): Int {
        return (age + value.toInt())
    }

}