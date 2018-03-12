class Apple(color:String, shape: String) {
    init {
        println("Color: $color")
        println("Shape: $shape")
    }
}

fun main(args:Array<String>) {
    var fruit = Apple("Red", "Circular")
}