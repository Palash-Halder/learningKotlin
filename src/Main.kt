//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Unary Operator
/**
fun main() {

var e = 10;
var flag = true;
println("First print then increment: "+ e++);
println("First increment then print: "+ ++e);
println("First print then decrement: "+ e--);
println("First decrement then print: "+ --e);
}
 */



// Logical Operators
/*
fun main() {
    val x = 100;
    val y = 25;
    val z = 10;

    var result = false;

    if (x > y && x > z)
        println(x)

    if(x < y || x > z)
        println(y)

    if (!result)
        println("Logical Operators")
}

 */

// Standard Input/Output
/*
fun main(){
    print("Hello, Geeks!")
    println("This is Kotlin Tutorial.")
}
*/


//kotlin program to print string:
/*
fun main(){
    println("GeeksforGeeks")
    println("A Computer Science Portal for Geeks")

    print("GeeksforGeeks - ")
    println("A Computer Science Portal for Geeks")
}

 */

// Print literals and Variables –
/*
fun sum(a: Int, b: Int) : Int{
    return a + b;
}
fun main(){
   var a = 10
    var b = 20
    var c = 30L
    var marks = 40.4

    println("Sum of {$a} and {$b} is : ${sum(a, b)}")
    println("Long value is: $c")
    println("marks")
    println("$marks")
}
*/


// =============================================================================
// Kotlin Input –
// You can take input from user with the help of the following function:
// readline() method    and    Scanner class
// Take input from user using readline() method –
/*
fun main(){
    print("Enter Text: ")
    var input = readLine()
    print("You entered: $input")
}
*/

// =============================================================================
// Take input from user using Scanner class –
//      import java.util.Scanner;

/*
import java.util.Scanner

fun main(){
    val number1 = Scanner(System.`in`)
    print("Enter an Integer: ")

    var enteredNumber1:Int = number1.nextInt()
    println("You entered: $enteredNumber1")

    val number2 = Scanner(System.`in`)
    print("Enter a float value: ")

    var enteredNumber2:Float = number2.nextFloat()
    println("You entered: $enteredNumber2")

    val booleanValue = Scanner(System.`in`)
    print("Enter a boolean: ")

    var enteredBoolean:Boolean = booleanValue.nextBoolean()
    println("You entered: $enteredBoolean")
}
*/

// ===================================================================
// Take input from user without using the Scanner class –
/*
fun main(){
    print("Enter an Integer: ")
    val string1 = readLine()!!

    var integerValue: Int = string1.toInt()
    println("You entered: $integerValue")



    print("Enter a double value: ")
    val string2 = readLine()!!

    var doubleValue: Double = string2.toDouble()
    println("You entered: $doubleValue")



    print("Enter a boolean: ")
    val string3 = readLine()!!

    var booleanValue:Boolean = string3.toBoolean()
    println("You entered: $booleanValue")
}

 */

// ==================================================================
// Kotlin Type Conversion
/*
fun main()
{

    println("259 to byte: " + (259.toByte()))
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    // Char to Number is deprecated in kotlin
    println("A to Int: " + ('A'.toInt()))
}
*/

// =======================================================================
// Kotlin Expression, Statement and Block


// Kotlin Expression –
/*
fun sumOf(a: Int, b: Int): Int{
    return a + b
}

fun main(){

    val  a = 10
    val b = 5
    var sum = sumOf(a, b)
    var mul = a * b
    println(sum)
    print(mul)
}

 */


// syntax: if(condition) condition met! else condition not met!


// Kotlin if expression –
/*
fun main(){
    val a = 1000
    val b = 999
    var c = 1122

    var max1 = if(a > b) a else b
    var max2 = if(c > a) c else a

    println("The maximum of ${a} and ${b} is $max1")
    println("The maximum of ${c} and ${a} is $max2")

}
*/


// Kotlin Statement –
    /*
    // Declaration of a variable is a statement
    val marks = 90
    var grade = 'A'

    // Assigning a value to a variable is also statement
    var sum =  10 + 20

    */

// Multiple Statements:
/*
fun main(){
    val sum: Int
    sum = 100
    println(sum)                            // single statement
    println("Hello"); println("Geeks")    // Multiple statements
}

*/

// Kotlin Block –
/*
    fun main(){                                 //start of main block or outer block
        val array = intArrayOf(2, 4, 6, 8)

        for (element in array)                  // start of inner block
            println(element)                      // end of inner block
    }                                           // end of main block

 */




// ========================================================================

// Kotlin if-else expression
// There are different types of if-else expressions in Kotlin:

    //if expression
    //if-else expression
    //if-else-if ladder expression
    //nested if expression

// if statement:
    /*
        Syntax:  if(condition) { //
            // code to run if condition is true
        }
    */


