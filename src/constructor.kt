fun main() {
    var dog1 =Dog("Billy","Chihuahua","Brown",10)
    println(dog1.breed)
    var dog2 =Dog("Mike","Doberman","Brown",7)
    println(dog2.name)
    var dog3 =Dog("Joseph","German Shepherd","Dark Brown",8)

    var dog4 =Dog("Ian","Siberian Husky","White",9)

}
class Dog(var name:String,var breed:String,var color:String,var age:Int){

}