//1. Pattern

fun main() {
   var n = 6
    for(i in 1 until n){
        for(j in 1 until (n-i) ){
            print(" ")
        }
        for( p in 1 until (2*i) ){
        print("*")
        }
        println()
    }
  for (i in n downTo 1) {
        for (j in (n - i) downTo 1) {
            print(" ")
        }
        for (p in (2 * i - 3) downTo 1) {
            print("*")
        }
        println()
    }

}

::  https://pl.kotl.in/KsyuLLgFk?theme=darcula ::

//2.  Armstrong Number
fun main() {
    val n=153
    var num=n
    var q=0
    var t=0
    var s=0
    
    while(num!=0){
        t=num%10
        s=t*t*t
        q = q + s
        num=num/10
    }
    if(q == n){
    	println("$q is Armstrong")    
    }
    else{
        println("$q is Not Armstrong")
    }    
}

//3.	Find the GCD of two numbers using Euclidean method

fun main() {
    val num1 = 30
    val num2 = 20

    var a = num1
    var b = num2
    var temp: Int

    while (b != 0) {
        temp = b
        b = a % b
        a = temp
    }

    println("GCD of ($num1, $num2) is $a")
}

:: https://pl.kotl.in/GhYUNZ-6u ::


//4.	Find the frequency of letters in a string
fun main() {
    var str = "This is Android Development Course"
    var letter = 'e'
    var freq = 0

    for (ch in str) {
        if (ch.toLowerCase() == letter) {
            freq++
        }
    }

    println("Frequency of $letter in $str is $freq")
}

//5.	Check if a number is duck number or not

fun main() {
    
    val num = 10980998
    var n=num
    var k=0
    
    while(n!=0){
        if(n % 10 == 0){
            println("$num is a duck number")
            k++
            break
        }
        n=n/10
    }
    if(k==0){
        println("$num is not a duck number")
    }
}



---------------------------------

fun main() {
    var strn="This is Android Development Course"
    var str= "elephant"
    var Freq=0
    var Letter = "e"
    var len = str.length
    
    for(i in 1..len){
        if(str == Letter ){
            Freq++
        }
    }
    
    println("Frequency of $Letter in $str is $Freq")
    
}