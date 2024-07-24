import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("Enter a letter : ")
    val ch = scanner.next()[0]

    when (ch) {
        'a','e' ,'i' ,'o' ,'u' -> println("$ch is vowel")
        else -> println("$ch is consonant")
    }
}
