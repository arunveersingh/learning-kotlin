package com.arunveersingh.collections

fun main(args: Array<String>) {
    val ints = listOf<Int>(1, 2, 3, 4, 5, 6)

    val smallInts = ints.filter { it < 4 }

    for (i: Int in smallInts){
        println(i)
    }

    val squares = ints.map { it*it }

    for (i in squares){
        println("Squared value: $i")
    }

    val squareOfLessThan4 = ints
        .filter { it < 4 }
        .map { it*it }

    for (i in squareOfLessThan4){
        println("Squared value: $i")
    }

    val meetings = listOf(Meeting(1, "board meet"),
        Meeting(2, "committee meeting"))

    val titles = meetings.map { m -> m.title }
    for (t in titles){
        println(t)
    }
}

class Meeting(val id: Int, val title: String){

}