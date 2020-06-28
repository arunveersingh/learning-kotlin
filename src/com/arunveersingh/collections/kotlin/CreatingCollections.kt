package com.arunveersingh.collections.kotlin

import com.arunveersingh.collections.java.Meeting
import com.arunveersingh.collections.java.Organizer

fun main() {

    val people : List<Person> = listOf<Person>()
    val peopleNullable : List<Person?> = listOf<Person?>()

    val aList  = listOf(
        Person(20),
        Person(25), null)

    val aNonNullList  = listOf(
        Person(20),
        Person(25)
    )

    for (person: Person? in aList){
        println(person?.age)
    }

    for (person: Person in aNonNullList){
        println(person.age)
    }

    val peopleMutable : MutableList<Person> = mutableListOf<Person>()
    peopleMutable.add(Person(2))


}

class Person(val age: Int) : Organizer {
    override fun processMeetings(meetings: MutableList<Meeting>?) {
        TODO("Not yet implemented")
    }

}