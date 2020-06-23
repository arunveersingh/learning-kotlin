package com.arunveersingh.companionobjects

fun main(){

    // this acts like a static method
    Student.createPostGrad("test student")
    Student.createUnderGrad("test .. ")

}

abstract class Person(var firstName: String, var lastName: String) {
    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress():String
}

open class Student(firstName: String, lastName: String, _id: Int, var tutor: String = "") : Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    fun enrole(courseName: String){
        //Courses.initialize()
        val course = Courses.allCourses
            .filter { it.title == courseName }
            .firstOrNull()
    }

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        return ""
    }

    companion object : XmlSerializer<Student>{
        fun createUnderGrad(name: String) : Undergraduate {
            return Undergraduate(name)
        }
        @JvmStatic
        fun createPostGrad(name: String) : Postgraduate {
            return Postgraduate(name)
        }

        override fun toXml(item: Student) {
            TODO("Not yet implemented")
        }


    }
}

class Program {
    companion object {
        // Mark with JVM static to invoke them as
        // static method from Java
        @JvmStatic
        fun main(args: Array<String>){
            println("Inside main")
        }
    }
}

class Postgraduate(firstName: String) : Student(firstName, "", 1) {

}

class Undergraduate(firstName: String): Student(firstName, "", 1) {

}

interface XmlSerializer<T> {
    fun toXml(item: T)
}