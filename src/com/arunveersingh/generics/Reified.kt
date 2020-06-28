package com.arunveersingh.generics

fun main() {
    val names= listOf("Adhrit")
}

fun printType(items: List<Any>){
    val stuff = items as List<String>

    stuff.filter { s -> s == "" }
}