package com.arunveersingh.programmingwithtypes

fun main(){
    var car1 = Vehicle(1, "volvo c40")
    var car2 = Vehicle(1, "volvo c40")

    var newCar1 = car1.copy(name = "bmw x3")

    if(car1 == car2){
        println("equal")
    } else {
        println("not equal")
    }

    if(car1 == newCar1){
        println("equal")
    } else {
        println("not equal")
    }
}

data class Vehicle(val id: Int, val name: String){

}