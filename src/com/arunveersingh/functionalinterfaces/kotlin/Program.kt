package com.arunveersingh.functionalinterfaces.kotlin

import com.arunveersingh.functionalinterfaces.java.Created
import com.arunveersingh.functionalinterfaces.java.User

fun main() {
    var user: User = User("Adhrit")
    var user2 = User("Birdy")

    var count = 0

    var lambda = { it: User -> println("User $it has been created.") }
    var lambda2 = { it: User -> println("User $it has been created: ${++count} times.") }

    // note: here a lambda is reused again and again
    user.create { it -> println("User $it has been created.") }
    user2.create { println("User $it has been created.") }
    //user.create { it -> println("User $it has been created") }

    // but as soon as state is added, a lambda is not reused as is.
    // underneath every time new instance is created.
    user.create { println("User $it has been created: ${++count} times.") }
    user2.create { println("User $it has been created: ${++count} times.") }

    user.create(lambda)
    user2.create(lambda)

    user.create(lambda2)
    user2.create(lambda2)

    /**
     * SAM Constructor
     */
    // Below code do not work as it keeps on wondering for the
    // type associated to it.
    //var eventListener = {println("User $it has been created.")}
    // there is a work around to above issue: and this is called
    // SAM Constructor
    var eventListener = Created {println("User $it has been created.")}
}