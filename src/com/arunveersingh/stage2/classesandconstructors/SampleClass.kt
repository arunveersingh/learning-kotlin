package com.arunveersingh.stage2.classesandconstructors

class Person constructor(name: String){
    val firstProperty = "First property $name".also(::println)

    private val secondProperty: Int

    private val thirdProperty: String

    init {
        if (name != "Arun"){
            secondProperty = name.length
            thirdProperty = name.toUpperCase();
        } else {
            secondProperty = 4
            thirdProperty = "ARUN";
        }
    }

    var children: MutableList<Person> = mutableListOf()

    constructor(name: String, parent: Person): this(name){
        parent.children.add(this)
    }

    fun testAccessingConstructorArgs(){
        println(secondProperty)
    }
}

fun main(){
    Person("Adhrit", Person("Arun")).testAccessingConstructorArgs()
}