fun main(){
    //Boolean size 1bit false/true
    //Char size 166bit "a" to "z" "/n" "/101"
    /*
    Numbers
    //Byte size 8bit -127 to 128
    //Double size 64 bit 3.4d
    //Float size 32bit 3.4f
    //Int size 32bit -2 -1 0 1 2
    //Long size 64bit -2L -1L 0L 1L 2L
    //Short size 16bit none
     */
    // String "Hola"
    //Array of int [1,2,3]
    //println("HOLA")
    //println(42)
    //println(3.14)
    //println(true)
    //println('a')
    val dayOfBirth : Int = 21
    val monthOfBirth : Int = 1
    println("My birthday is $dayOfBirth/$monthOfBirth")
    println("My birthday is: " + dayOfBirth + "/" + monthOfBirth)
    var name : String = "Marcos"
    var lasName : String = "Ruiz"
    println("My name is ${name.uppercase()} ${lasName.lowercase()}")
    println("My name is: " + name + " " + lasName)
    name = "Marc"
    println("My name is $name $lasName")

}