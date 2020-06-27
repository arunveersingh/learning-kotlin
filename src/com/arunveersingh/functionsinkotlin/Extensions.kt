package com.arunveersingh.functionsinkotlin

fun main(){
    var text = "I am     a     text with      \t whitespace"
    println(replaceMultipleWhiteSpaces(text))

    // Invoking an extension function version
    println(text.replaceMultipleWhiteSpacesEx())
}

fun replaceMultipleWhiteSpaces(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

/**
 * this is an extension Function to string class!
 */
fun String.replaceMultipleWhiteSpacesEx() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}