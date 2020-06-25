package com.arunveersingh.collections

fun main(){

    val greaterThanThree = {v:Int -> v > 3}


    var ints = listOf(1, 2, 3, 4, 5)

    // predicate to verify a condition apply to all the inputs
    val largeInts = ints.all { it > 3 }
    println(largeInts)

    // predicate to verify a condition apply to all the inputs
    val anyInt = ints.any { it > 3 }
    println(anyInt)

    // predicate to verify a condition apply to all the inputs
    val count = ints.count() { it > 3 }
    println(count)

    val largeIntsFilter = ints.filter { it > 3 }
    println(largeIntsFilter)

    println("greater than three: ${greaterThanThree.invoke(10)}")
    println("greater than three: ${greaterThanThree.invoke(3)}")
    println(ints.all(greaterThanThree))
    println(ints.count(greaterThanThree))
    println(ints.any(greaterThanThree))

    var found = ints.find(greaterThanThree)
    println("found greater than three: $found")
}