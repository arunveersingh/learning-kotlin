package com.arunveersingh.collections.kotlin

fun main() {

    val meetings = listOf<VideoMeeting>(
        VideoMeeting(
            1,
            "gafh"
        ), VideoMeeting(2, "sdjhfagsd")
    )

    val people = meetings.map { it -> it.people }
    println(people) // [[A, B, C], [A, B, C]]; list of list

    println(meetings.flatMap { it -> it.people }) // [A, B, C, A, B, C] single list

    println(meetings.flatMap { it -> it.people }.distinct()) // [A, B, C] single list


}

class VideoMeeting(val id: Int, var desc: String) {

    var people = listOf<String>("A", "B", "C")

}