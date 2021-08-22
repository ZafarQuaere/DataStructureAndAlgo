package com.example.kotlinpractice

import java.util.*


fun main(){
    findFactorial()
}

fun findFactorial() {
// Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    val integer:Int = reader.nextInt()
    val fact = fact(integer)
    println("Factorial of $integer is: $fact")
}

fun fact(n: Int): Int {
   if (n == 0)
       return 1
    return n* fact(n-1)
}
