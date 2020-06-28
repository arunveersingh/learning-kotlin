package com.arunveersingh.higherorderfunctions

val action = { println("Hello World")}
val calc = {x: Int, y:Int -> x * y}
val calc2: (Int, Int) -> Int = {x, y -> x * y}

fun main() {
    doSomething(action)
}

fun doSomething(func: () -> Unit){
    func()
}

