package com.arunveersingh.stage2.classesandconstructors

open class APolygon {
    open fun draw() {}
}

abstract class CRectangle : APolygon() {

    // override an impl with Abstract
    abstract override fun draw()
}

open class Shape {
    open val vertexCount: Int = 0;
    open fun draw() { /*...*/
    }

    fun fill() { /*...*/
    }
}

class Circle() : Shape() {
    override val vertexCount: Int = 4;
    override fun draw() { /*...*/
    }
}
