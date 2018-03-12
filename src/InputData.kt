fun main(args:Array<String>) {
    println("Please enter your name: ")
    var name = readLine()
    println("Please enter your age")
    var age:Int = readLine()!!.toInt()

    println("Your name is $name; your age is $age")
}