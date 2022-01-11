package com.example.projectforkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.io.File
import java.io.FileInputStream

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Функциональное программирование. Sequence
        funSequence()

        //Конструкция when
        whenExample(2)

        //companion object
        ClassForCompanionObject.exampleForCompanionObject()

        //try catch example
        funTryCatch()

        //arrayExample
        funArrayExample()

        //companion object
        Parent.printHello()

        //наследование
        val parent = Parent("Bob", 50)
        parent.printParentClassInfo()

        val kid = Kid("Tom", 20)
        kid.printParentClassInfo()
        kid.printKidClassAge()

        //полиморфизм
        val valueInt : Int = 5
        val valueDouble : Double = 6.0

        kid.getFutureAge(valueInt)
        kid.getFutureAge(valueDouble)

        //абстракция
        val car = Car() //интерфейс

        val kate: Person = Person("Kate", 6) //абстрактный класс
        kate.hello()

        //null safety
        var a: String? = "abs"
        a = null
        print(a?.length)

        val len = a?.length ?: -1


        //data class

        var dcExample = DataClassExample("Ann")
        dcExample.age = 10


        //read from file
        readFromFile("file.txt")






    }

    fun funSequence() {
        val numberSequence = sequenceOf("one", "two", "three", "four")

        val infiniteSeq = generateSequence(1) { it + 2 }
        val finiteSeq = generateSequence(1) {if (it < 10) it + 2 else null}

        data class Person(val name: String, val age: Int)
        val listOfPersons = listOf(
            Person("Ann", 10),
            Person("Bob", 20),
            Person("Sue", 18),
            Person("Ann", 15)
        )
        val names = listOfPersons
            .asSequence()
            .filter { it.age > 10 }
            .map { it.name }
            .distinct()
            .sorted()
            .toList()

        val oldestPerson = listOfPersons
            .asSequence()
            .maxByOrNull { it.age }
    }

    fun whenExample(color : Int): String {
        var answer =""
        when(color) {
            1 -> answer = "White"
            2 -> answer = "Blue"
            3 -> answer = "Yellow"
        }
        return answer
    }

    fun funTryCatch() {
        try {
            val exception = 1/0
        }
        catch (e : Exception){
            println(e.message)
        }
        finally {
            println("end")
        }

    }

    fun funArrayExample(){
        val arr = arrayOf(1,2,3,4,5)
        val arrList = arrayListOf(1,2,3,4)
        arrList.add(5)
        arrList.add(3, 8)
        arrList.remove(8)
        arrList.trimToSize()

    }


    fun readFromFile(path: String) {
        applicationContext.assets
                .open(path)
                .bufferedReader().use {
                    it.readText()
                }
    }

}