package com.arunveersingh.functionsinkotlin

class PersonWC(var name: String) {
    fun display(){
        println("Display: $name")
    }

    fun displayWithLambda(function: (s: String) -> Unit){
        function(name)
    }
}