package com.arunveersingh.stage2.classesandconstructors

class Constructors {

    init {
        println("Init block")
    }

    constructor(i: Int){
        println("Constructor $i")
    }
}

fun main(){
    Constructors(1)
}