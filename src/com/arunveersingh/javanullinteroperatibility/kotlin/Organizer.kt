package com.arunveersingh.javanullinteroperatibility.kotlin

import com.arunveersingh.javanullinteroperatibility.java.Address
import com.arunveersingh.javanullinteroperatibility.java.Meeting

fun main() {
    val m = Meeting()

    val title: String? = m.meetingTitle()

    // this is not compiled as it java indicates that
    // title cannot be null
    //m.addTitle(null)

    println(title)

    val title2: String = m.titleCanBeNull() ?: "nobody"
    println(title2)
}

class HomeAddress : Address {
    override fun getFirstAddress(): String {
        return ""
    }

}

class WorkAddress: Address {
    override fun getFirstAddress(): String? {
        return null
    }

}