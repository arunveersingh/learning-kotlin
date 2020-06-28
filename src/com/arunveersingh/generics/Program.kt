package com.arunveersingh.generics

fun main() {
    var names:List<String> = listOf("Adhrit", "Birdy")

    val name = names.itemAt(1)
    println(name)

    val n:Node<Int> = Node(2)

}

fun <T> List<T>.itemAt(ndx: Int) : T {
    return this[ndx]
}

class Node<T : Number>(private val item: T){
    fun value():T{
        return item
    }
}