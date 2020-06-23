package com.arunveersingh.highlevelfunctions

import java.util.*

class Meeting {
    var title: String = ""
    var whenn: Date = Date()
    var who = mutableListOf<String>()
}

fun main(args: Array<String>){
    val m = Meeting()
    m.title = "Board Meeting"
    m.whenn = Date(2017, 1, 1)
    m.who.add("Kevin")


    // with is not part of language, it is part of standard library!
    with(m){
        title = "Board Meeting"
        whenn = Date(2017, 1, 1)
        who.add("Kevin")
    }

    m.apply {
        title = "Board Meeting"
        whenn = Date(2017, 1, 1)
        who.add("Kevin")
    }

}