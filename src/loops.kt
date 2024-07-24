fun main() {
    //while

    var number = 30
    while (number <= 35){
        println("Number is $number")
        number++
    }
    var num = 10
    while (num >= 5) {
        println("Number is $num")
        num--
    }

    //Break
    var count = 100
    while (count <= 105){
        println("Count is $count")
    count++
       if (count == 103) {
           break
       }
    }

    //Continue
    var x = 25
    while (x<=30){
        if (x==27){
            x++
            continue
        }
        println(x)
        x++
    }



}