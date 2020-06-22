package com.arunveersingh

import java.math.BigInteger

fun main(){

    // this will throw stackoverflow flow exception beacuse of
    // so much of recursive calls
    //println(fib(10000, BigInteger("1"), BigInteger("0")))

    // this will not throw stackoverflow exception as
    // kotlin optimises the method becauss of tailrec keyword
    println(fib2(10000, BigInteger("1"), BigInteger("0")))

}

fun fib(n: Int, a: BigInteger, b: BigInteger) : BigInteger {
    return if (n == 0) b else fib(n-1, a + b, a)
}

tailrec fun fib2(n: Int, a: BigInteger, b: BigInteger) : BigInteger {
    return if (n == 0) b else fib2(n-1, a + b, a)
}