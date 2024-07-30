fun main() {

    for (num in 1..6){
        println("Number : $num")
    }

    for (letter in 'a'..'f'){
        println("Letter is $letter")
    }

    for (c in 20..25){
        if (c==23){
            break
        }
        println(c)
    }

    for(n in 160..167){
        if (n==164){
            continue
        }
        println(n)
    }

    for (myletter in 'a'..'e'){
        if (myletter=='c'){
            continue
        }
        println(myletter)
    }


}