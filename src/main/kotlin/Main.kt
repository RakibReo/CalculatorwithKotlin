import java.util.Scanner

fun main() {
    print("Enter Your Name: ")
    val stringInput = readln()


    val reader=Scanner(System.`in`)
    print("Input First Number: ")
    val firstNumber: Int =reader.nextInt();
    print("Input Second Number: ")
    val secondNumber: Int =reader.nextInt();

    val sum=firstNumber+secondNumber
    val subtract=firstNumber-secondNumber
    val multiply=firstNumber*secondNumber
    val division=firstNumber/secondNumber


    println("You entered: $stringInput")
    println("First Number: $firstNumber")
    println("Second Number: $secondNumber")
    println("Sum : $sum")
    println("Subtraction: $subtract")
    println("Multiplication: $multiply")
    println("Division: $division")


}