fun main() {

  var doctor1 = Person()
  println(doctor1.name)
  doctor1.speak()

}
class Person{
    var name= "Jane"
    var age = 35
    var department = "Department1 "

    fun speak(){
        println("Doctor is speaking")
    }
}