fun main(args: Array<String>) {

    println("Enter two numbers: ")

    val first = readln().toDouble()
    val second = readln().toDouble()


    print("Enter an operator (+, -, *, /): ")

       val result : Any = when (val operator = readln()[0]) {
        '+' -> first + second
        '-' -> first - second
        '*' -> first * second
        '/' -> first / second
        else -> {
            println("Error!! operator is not correct")
        }
    }
    println("""
        ☆ （ • •）☆
        ╔uu═══════════════════════════════════╗☆
        ❝         < RESULT: $result >         ❞
        ╚══════nn═════════════════════════════╝

    """.trimIndent())
}