
fun main() {
    //standard library Functions/Predefined functions
    var x = Math.sqrt(144.0)
    println("thee square root of 144 is $x")

    var y = Math.round(45.87)
    println("the output is $y ")

    school() //Calling a function
    student("Joseph", 21)
    employee("John", 34000, false)
    employee("Frank", 70000, true)

}
//User-Defined Functions
fun school(){
    println("Emobilis")
}

//Parameter/Variable and Argument/Value
fun student(name:String,age:Int){
    println("$name is $age years old")

}

fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary .Disability: $disability ")
}