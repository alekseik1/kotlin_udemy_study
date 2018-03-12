fun main(arg:Array<String>) {
    // Simple calculator
    println("Enter the first number:")
    var n1:Float = readLine()!!.toFloat()
    println("Enter the second number:")
    var n2:Float = readLine()!!.toFloat()

    var sum = n1 + n2
    var sub = n1 - n2
    var prod = n1*n2
    var div = n1 / n2
    println("The sum is $sum")
    println("The difference is $sub")
    println("The product is $prod")
    println("The division is $div")
}