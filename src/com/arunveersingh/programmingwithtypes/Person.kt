package com.arunveersingh.programmingwithtypes

open class Person {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
}

// only open class can be extended
class Student: Person() {

    // only open functions can be extended
    override fun getName(): String {
        return ""
    }
}

abstract class Animal {
    var firstName: String = ""
    var lastName: String = ""

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

// internal allows this class to be accessed within this module
internal class Dog : Animal() {

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

}