fun add(a:Double, b:Double):Double {
    return a + b
}

fun main(args:Array<String>) {
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()

    println("sum is " + add(a, b))
}

