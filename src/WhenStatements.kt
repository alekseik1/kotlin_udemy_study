fun main(args:Array<String>) {
    var marks:Int = readLine()!!.toInt()

    when(marks) {
        1-> { print("Is equal to 1") }
        2-> { print("Equal to 2") }

        else -> { print("Bad input") }
    }
}