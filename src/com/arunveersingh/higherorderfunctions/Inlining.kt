package com.arunveersingh.higherorderfunctions

import java.lang.Exception
import java.util.function.BiPredicate
import java.util.function.Predicate

fun main() {
    val ints = listOf(1, 2, 3, 4, 5, 6)
    val i = first(ints) { i -> i == 3}
    println(i)
}

inline fun <T> first(items: List<T>, predicate: (T) -> Boolean): T {
    for (item in items) {
        if (predicate(item)) return item
    }
    throw Exception()
}