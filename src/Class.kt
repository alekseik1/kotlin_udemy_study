class Apple(color:String, shape: String) {
    var color:String? = null
    var shape:String? = null

    init {
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