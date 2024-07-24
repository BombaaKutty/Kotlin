import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter patient's temperature : ")

    var temp = read.nextInt()

    if (temp > 37){
        println("High fever")

    }
    else if (temp < 37){
        println("Low fever")
    }
    else    {
        println("Normal Temperature")
    }


}