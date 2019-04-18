package com.mckornfield.kotlinfun

/**
 * Also they can be multiline
 * like this comment here
 */
fun main(args: Array<String>) {
    println("Hello Boys!")

    // They can come at any time
    val age: Int = 12 // Comments man

    var candy: String = "Twix"

    var thing : String

    thing  = "abc"
    println(age)
    println(candy)

    candy = "Snickers"

    println(candy)

    val weather = "Party cloudy"
    println(weather)

    var wallet = 180
    println(wallet)
    wallet -= 60

    println(wallet)

    wallet += 100

    println(wallet)

    var pi: Double = 3.14

    var radius = 5

    var c = pi * radius.toDouble() * 2

    println("%.2f".format(c))

    var weight = 160

    weight -= 5

    println(weight)
}