import com.arunveersingh.functionsinkotlin.Person
import com.arunveersingh.functionsinkotlin.PersonWC
import java.io.FileNotFoundException
import java.io.FileReader
import java.util.*

fun main(args: Array<String>) {
    println("Hello, World")

    // var
    var birdy = Person()

    // val
    val arun = Person()

    arun.name = "Arun"
    println("Name is ${arun.name}")

    // val can't be reassigned
    //arun = Person()

    val rohit = PersonWC("Rohit")
    println("Name is ${rohit.name}")
    rohit.display()

    rohit.displayWithLambda(::printName)

    var q = Question()

    for (i in 1..10) {
        println(i)
    }

    for (i in listOf<Int>(11, 12, 3, 4, 5)) {
        println("out of list $i")
    }

    for (i in 1 downTo -10) {
        println("until $i")
    }

    var ages = TreeMap<String, Int>()
    ages["Mango"] = 5
    ages["Apple"] = 20

    for (i in ages) {
        println("from ages $i")
    }

    for (i in ages.values) {
        println("from ages $i")
    }

    for (i in ages.keys) {
        println("from ages $i")
    }

    for (i in ages.entries) {
        println("from ages $i")
    }

    // here name is the key value pair
    for (name in ages) {
        println("name: $name")
    }

    // here name is the key NOT pair
    for ((name) in ages) {
        println("name: $name")
    }

    // here name is the key NOT pair
    for ((name, age) in ages) {
        println("name: $name, age: $age")
    }

    for ((index, element) in ages) {
        println("index of $element is $index")
    }

    var numbers = listOf<Int>(100, 300, 200)

    for ((index, element) in numbers.withIndex()) {
        println("index of $element is $index")
    }

    var range = '1'..'z'

    for (value in range) {
        println(value)
    }

    var reader = FileReader("filename")

    //reader.read()

    try {
        reader.read()
    } catch (e: FileNotFoundException) {

    } finally {

    }

}

fun printName(whateverIsInput: String): Unit {
    println("whateverIsInput: $whateverIsInput")
}

class Question {

}