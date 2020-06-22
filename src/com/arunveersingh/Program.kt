/**
 * This can be used to give name as per need
 */
@file:JvmName("DisplayFunctions")

package com.arunveersingh

fun main(args: Array<String>){
    display("Hello, World from Java")

    println(max(1,2))

    log("Hello, World", 1)

    log("Hello, World")

    log("Hello, World", 1)

    log(message = "Hello, World passed as named parameters", logLevel = 5)

}

fun display(message: String) : Boolean {
    println(message)
    return true
}

fun max(a: Int, b:Int): Int = if (a > b) a else b

@JvmOverloads
fun log(message: String, logLevel: Int = 2){
    println("message: $message, logLevel: $logLevel")
}