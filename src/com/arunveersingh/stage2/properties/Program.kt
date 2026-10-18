class Address {
    var name: String = "Adhrit Yadav"
    var street: String = "My Street"
    var city: String = "My City"
    var state: String? = null
    var zip: String = "123456"

    private val postOffice: Int = 2

    val postOfficeExists: Boolean
        get() = this.postOffice != 0

}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street

    return result
}

fun main(){
    println(copyAddress(Address()))
}
