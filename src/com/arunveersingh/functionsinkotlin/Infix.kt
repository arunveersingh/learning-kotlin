package com.arunveersingh.functionsinkotlin

fun main(){
    val h1 = Header("H1")
    val h2 = Header("H2")

    val h3 = h1.plusExt(h2)
    println(h3.name)

    // benefit of having an infix function is simple syntax and
    // function name acts as operator
    val h4 = h1 plusInFix h2

    val h5 = h1 + h2
    println(h5.name)
}

class Header(var name: String){

}

fun Header.plusExt(other: Header) : Header {
    return Header(this.name + other.name)
}

/**
 * Using infix make a extension act as operator
 */
infix fun Header.plusInFix(other: Header) : Header {
    return Header(this.name + other.name)
}

infix operator fun Header.plus(other: Header) : Header {
    return Header(this.name + other.name)
}