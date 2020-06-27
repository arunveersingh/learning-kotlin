package com.arunveersingh.kotlinnullability.kotlin

fun main() {
    var m:Meeting? = null;
    var newMeeting = Meeting()

    // do not work
    //newMeeting = m
    // it works
    //m = newMeeting
    closeMeeting(newMeeting)

    // this will not compile as
    // method do not accept null
    //closeMeeting(m)

    // added another method just to ensure
    // method starts accepting null

    // this will compile with some changes in the
    // closeMeetingX version of the method closeMeeting
    closeMeetingX(m)

    //newMeeting = m?: Meeting()
    closeMeetingXX(m?: Meeting())

    // 'let' is a library function, which can let us handle
    // the below code. Below code is not compilable as is
    // as closeMeetingNotNull do not allow null as a Meeting
    //closeMeetingNotNull(m)

    // below syntax allows call to closeMeetingNotNull
    // only when m is not null
    m?.let { closeMeetingNotNull(m) }
}

fun closeMeeting(m:Meeting): Boolean? {
    return if (m.canClose) m.close()
    else false
}

// Meeting? means it can accept null
fun closeMeetingX(m :Meeting?): Boolean {

    // ?. means safe call.
    // Invoke canClose only if m is not null.
    return if (m?.canClose == true) m.close()
    else false
}

fun closeMeetingXX(m :Meeting?): Boolean {

    // !! means throw an exception if is null
    return if (m!!.canClose) m.close()
    else false
}

// created this meeting to test the 'let'
fun closeMeetingNotNull(m:Meeting): Boolean? {
    return if (m.canClose) m.close()
    else false
}

class Meeting {
    var canClose = false
    lateinit var address: Address

    fun close(): Boolean {
        return false
    }

    fun save(o: Any){

        // this throw  an exception
        val saveable = o as ISaveable

        val saveableAllowedNull = o as? ISaveable
        saveable?.save()
    }

    fun init(addr: Address){
        address = addr
    }

}

interface ISaveable {
    fun save()
}

class Address {

}