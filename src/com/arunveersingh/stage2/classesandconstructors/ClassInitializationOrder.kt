package com.arunveersingh.stage2.classesandconstructors

open class Base(val name: String) {
    init {
        println("Initializing a base class")
    }

    open val size: Int = name.length.also {
        println("Initializing size in the base class: $it")
    }
}

class Derived(
    name: String,
    private val lastName: String
) : Base(name.capitalize().also { println("Argument for the base class: $it") }) {
    init {
        println("Initializing a derived class")
    }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}

fun main() {
    println("Constructing the derived class(\"hello\", \"world\")")
    Derived("hello", "world")
}