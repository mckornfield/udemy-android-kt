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

    // Two similar for loops

    for (candy in topCandy) {
        println(candy)
    }

    for (x in 0..topCandy.size - 1) {
        println(topCandy[x])
    }

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

    for (x in 1..1_000) {
        if (x > 453) {
            print(x)
        }
    }
    println("")

    fun printHello() {
        println("Hello!")
    }

    val printString = { a: String -> print(a) }
    printString("abc")
    fun addTwoNumbers(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    printHello()

    val num = addTwoNumbers(addTwoNumbers(1, 5), 2)
    println(num)

    fun makeSentence(name: String, age: Int) {
        println("My dog's name is $name and he is $age year(s) old")
    }

    makeSentence("Spot", 5)

    class Dog() {
        var name = ""
        var age = 0
        var furColor = ""

        fun dogInfo() : String {
           return "$name $age $furColor"
        }
    }

    var myDog = Dog()
    myDog.name = "bob"
    myDog.age = 3
    myDog.furColor = "white"

    println(myDog.dogInfo())

    var yourDog = Dog()
    myDog.name = "not-bob"
    myDog.age = 35
    myDog.furColor = "grey"
    println(yourDog.dogInfo())

    class Kindle {
        var version = 2
        var color = "black"
        var battery = "Full"

        fun kindleInfo() : String {
            return "My kindle is version $version, it is the color $color and its battery is $battery"
        }
    }

    val myKindle = Kindle()

    println(myKindle.kindleInfo())
}
