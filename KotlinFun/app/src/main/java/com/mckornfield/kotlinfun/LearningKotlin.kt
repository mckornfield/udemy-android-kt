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

    var thing: String

    thing = "abc"
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

    var isTheLightIsOn: Boolean = false

    if (isTheLightIsOn) {
        println("Walk across the room")
    } else {
        println("Don't move a muscle")
    }

    val canRide = age > 11

    println(canRide)

    if (age == 17) {
        println("Enjoy the ride")
    } else {
        println("Sorry son... ")
    }

    if (weight > 80) {
        println("Slide on down!")
    } else {
        println("Try out the kiddie pool")
    }

    if (candy == "Snickers") {
        println("Hey candy")
    }

    var topCandy = arrayOf("Fun Dip", "Snickers", "100 Grand Bar")

    topCandy[0] = "Black Thunder"

    println(topCandy[0])
    println(topCandy[1])
    println(topCandy[2])

    var secondTopCandy = mutableListOf("Fun Dip", "Snickers", "100 Grand Bar")

    secondTopCandy[0] = "Twix"

    println(secondTopCandy)
    secondTopCandy.add(0, "Hershey's")
    println(secondTopCandy)


    // Create a mutableList of three favorite movies

    val topFavoriteMovies =
        mutableListOf("The Matrix", "Good Will Hunting", "The Lord of the Rings: The Return of the King")

    topFavoriteMovies.add("Clerks")

    println(topFavoriteMovies)

    var luckyNumbers = listOf(1, 5, 3423, 5, "abc")
    println(luckyNumbers)

}