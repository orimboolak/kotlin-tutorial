/** Variabales class
 *  Eugene Orimbo
 **/

fun main(args : Array<String>){

    println("Hello World!")

    /**
     * Mutable variables - These are varibles that change. These are declared using "var"
     */

    var myAge = 23
    println("My age is : " + myAge)

    /**
     * Immutable variables - These are read only or unchangable. These are created using "val"
     */

    val name = "Eugene Orimbo"
    println("My name is : " + name)

    /**
     * Kotlin uses -  Type inference refers to the automatic detection of the data type of an expression in a programming language. However you can still declare the data type
     */

    var myCardNo : Int = 123456789
    println("My card no is : " + myCardNo)

    /**
     * Declare Character in kotlin is done using single quote
     */

    val charExample : Char = 'A'
    println("Character example is : " + charExample)

    /**
     * Declare Boolean
     */

    val booleanExample : Boolean = true
    println("The boolean example is : " + booleanExample)

    /**
     * Type casting in kotlin
     * Convert 3.14 to interger
     */

    println("Converting 3.14 to Int : " + (3.14.toInt()))
    println("Converting 'A' to Int : " + ('A'.toInt()))

    /**
     * Arrays in Kotlin
     */

    var myArray = arrayOf(1, 3, "Hello", "World")
    println("The second element of the array is : " + myArray[1])

    myArray[1] = "Eugene"
    println("The second element of the array is : " + myArray[1])

    println("The length of array is : " + myArray.size)

    println("Does the array contain Eugene : " +myArray.contains("Eugene"))


}