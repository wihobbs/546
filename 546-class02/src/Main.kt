// Copyright 2022 William Hobbs
// CSCE 546 Assignment 2

import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    println("Welcome to the Quadratic Formula Program")
    // figure out initial "on"
    var on : Boolean = getOn()
    // This loop gets the arguments and calculates the discriminants
    while (on) {
        var a = getArg("ax^2")
        var b = getArg("bx")
        var c = getArg("c")
        // Store discriminant. Since it is used many times.
        print("Solutions: ")
        var disc : Double = discriminant(a, b, c)
        // See if it's real, and calculate solns accordingly.
        if (isReal(a, b, c)) {
            var sol1 : Double = ((-b + sqrt(disc))/2*a)
            var sol2 : Double = ((-b - sqrt(disc))/2*a)
            println("$sol1, $sol2")
        } else {
            var sol1 : String = "${-b/(2*a)} + ${sqrt(-disc)/(2*a)}i"
            var sol2 : String = "${-b/(2*a)} - ${sqrt(-disc)/(2*a)}i"
            println("$sol1, $sol2")
        }
        // Do they want to continue?
        on = getOn()
    }
    // var sqr : Boolean
    // var hobbs : String = "hobbs"
    // println(hobbs.length)
    // Lambda function: functions without a name associated with a variable, speed increases
    // :: operator
}

fun getArg (prompt: String) : Double {
    println("Please enter the variable $prompt: ")
    return readLine()!!.toDouble()
}

fun getOn () : Boolean {
    println("Type \"q\" if you would like to quit,\nor type \"s\" to continue.")
    return !(readLine() == "q")
}

fun isReal(a: Double, b: Double, c: Double) : Boolean {
    return ((b.pow(2) - 4*a*c) >= 0)
}

fun discriminant(a: Double, b: Double, c: Double) : Double {
    return ((b.pow(2) - 4*a*c))
}
