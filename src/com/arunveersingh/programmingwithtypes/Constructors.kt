package com.arunveersingh.programmingwithtypes

fun main(){
    val kevin = MyStudent("Kevin", "Jones",1)
    val kevin2 = MyStudent("Kevin", "Jones", 1, "A Tutor")
    println(kevin.id)

}

abstract class MyPerson (var firstName: String, var lastName: String) {

    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

//class MyStudent(firstName: String, lastName: String, _id:Int) : MyPerson(firstName, lastName) {
class MyStudent(firstName: String, lastName: String, _id:Int, var tutor: String = "") : MyPerson(firstName, lastName) {
    //val id = _id
    //or
    val id:Int
    //var tutor: String

    init {
        id = _id
        //tutor = ""
    }

    /*constructor(firstName: String, lastName: String, _id: Int, tutor: String): this(firstName, lastName, _id){
        this.tutor = tutor
    }*/

    /*constructor(firstName: String, lastName: String, _id: Int, tutor: String): this(firstName, lastName, _id){
        this.tutor = tutor
    }*/

    override fun getAddress(): String {
        TODO("Not yet implemented")
    }

    override fun getName(): String {
        return ""
    }
}