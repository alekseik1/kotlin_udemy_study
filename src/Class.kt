class Apple() {
    var color:String? = null
    var shape:String? = null

    constructor(color:String, shape: String): this() {
        this.color = color
        this.shape = shape
    }

    fun GetColor():String? {
        return color
    }

    fun GetShape():String? {
        return shape
    }
}

fun main(args:Array<String>) {
    var fruit = Apple("Red", "Circular")
    print("Color: ${fruit.GetColor()}")
}