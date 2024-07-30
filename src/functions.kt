fun main() {
    //Predefined functions
    println("eMobilis")

    var squareroot = Math.sqrt(9.0)
    println("The square root of 9.0 is: $squareroot")

    var round = Math.round(32.67)
    println("The answer is $round")

    var ceil = Math.ceil(32.97)
    println("The answer is $ceil")
day()
add()
student("Kaleb",19)
student("Kinyanjui",20)
student("Kuteli",21)


}

//User-defined functions
fun day(){
    println("Today is Tuesday")
}

fun add(){
    var num1 = 56
    var num2 = 100

    println(num1+num2)
}

//Parameter and Arguments
fun student(name:String,age:Int){
    println("$name is $age years old")
}