import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)

    print("Enter a letter : ")
    var ch = scanner.next()[0]

    when (ch) {
        'a','e' ,'i' ,'o' ,'u' -> println("$ch is a vowel")
        else -> println("$ch is a consonant")
    }
}
