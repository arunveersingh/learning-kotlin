package com.arunveersingh.companionobjects

class Course (val id:Int, val title: String){

}

// Singleton
object Courses {
    var allCourses = arrayListOf<Course>()

    fun initialize() {
        allCourses.add(Course(1, "Kotlin"))
    }
}