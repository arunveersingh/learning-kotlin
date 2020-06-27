package com.arunveersingh.infinitecollections

fun main() {

    val meetings = listOf<VideoMeeting>(VideoMeeting(1, "Board Meeting"), VideoMeeting(2, "Committee"))

    val people = meetings.map { it -> it.people }
    println(people) // [[A, B, C], [A, B, C]]; list of list

    println(meetings.flatMap { it -> it.people }) // [A, B, C, A, B, C] single list

    println(meetings.flatMap { it -> it.people }.distinct()) // [A, B, C] single list

    // this is evaluated immediately.
    // first all elements are filtered and
    // then mapped.
    var titles = meetings
        .filter { it -> it.desc.startsWith("C") }
        .map { m -> m.desc }

    println("titles: $titles")

    // sequences are lazily evaluated
    // evaluation starts with terminal operation
    // it is efficient as operations are not
    // repeated multiples per element.
    // Whenever this is evaluated all the
    // operations on an element are applied
    // in one go.
    var titles2 = meetings
        .asSequence()
        .filter { it -> it.desc.startsWith("C") }
        .map { m -> m.desc }

    // this is not a terminal operation
    // so this sequence is not evaluated.
    println("tiles2: $titles2")

    // sequence is evaluated here
    for (t in titles2) println("evaluated: $t")

    // Sequences are lazily evaluated so benefit
    // is that they can be passed across the methods.
    itr(titles2)

}

fun itr (seq: Sequence<String>) {
    for (t in seq){
        println("after itr: $t")
    }
}

class VideoMeeting(val id: Int, var desc: String) {

    var people = listOf<String>("A", "B", "C")

}