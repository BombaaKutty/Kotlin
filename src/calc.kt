import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    println("Enter first number: ")
    val first = read.nextInt()

    print("Enter an operator: ")
    val operator = read.next()[0]

    println("Enter second number: ")
    val second = read.nextInt()


    val result: Int

    when (operator) {
        '+' -> result = (first + second)
        '-' -> result = (first - second)
        '*' -> result = (first * second)
        '/' -> result = (first / second)
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }

    System.out.printf("$result")
}