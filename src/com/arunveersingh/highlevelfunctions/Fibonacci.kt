package com.arunveersingh.highlevelfunctions

fun main(args: Array<String>){
    var total = 0
    var program = Fibonacci()
    //program.fibonacci(12)
    program.fibonacci(12, object : Process {
        override fun execute(value: Int) {
            println(value)
        }
    })

    program.fibonacci3(12, {x -> println(x)})
    program.fibonacci3(12) { x -> println(x)}
    program.fibonacci3(12) { println(it) }
    program.fibonacci3(12, ::println)

    // Closure: kotlin can modify value inside.
    program.fibonacci3(12) { it -> total+=it}
    println("total $total")

}

interface Process {
    fun execute(value: Int)
}

class Fibonacci {

    fun fibonacci3(limit: Int, action: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    fun fibonacci(limit: Int, action: Process){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }

    /*fun fibonacci(limit: Int){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            println(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }*/
}