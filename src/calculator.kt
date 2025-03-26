import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Choose an operator :")
    println("1.Addition")
    println("2.Subtraction")
    println("3.Multiplication")
    println("4.Division")

    println("Choose operator number(1/2/3/4)")
    println("Enter first number :")
    var first = read.nextInt()

    println("Enter second number :")
    var second = read.nextInt()

    println("Enter operator :")
    var operator = read.nextInt()

    when(operator){
        1 -> println("Result: ${first + second}")
        2 -> println("Result: ${first - second}")
        3 -> println("Result: ${first * second}")
        4 -> {
            if (first != 0){
                println("Result: ${first / second }")
            }
            else{
                println("Infinity")
            }

        }
        else -> println("Invalid operator")


    }


}