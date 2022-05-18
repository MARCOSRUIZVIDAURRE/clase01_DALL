import kotlin.math.pow

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

    //Operaciones Matematicas
    //Suma
    println(2+2)
    //Resta
    println(2-2)
    //Divicion
    println(2/2)
    //Modulos
    println(2%2)
    //Multiplicacion
    println(2*2)
    //Operacion Matematica
    println(1 + (9 / 3) * 2)
    //Potencia
    println(2.0.pow(2))

    //Comparacion e Igualdad operadores
    //Igual
    println(2 == 2)
    //Desigualdad / Diferencia
    println(2 != 2)
    // Mayor que
    println(2 > 2)
    //Mayor que
    println(2 < 2)
    //Mayor o igual que
    println(2 >= 2)
    //Menor o igual que
    println(2 <= 2)

    var anyNumber: Int = 0
    //operadores de Asignacion
    anyNumber += 10
    anyNumber -= 2
    anyNumber *= 2
    anyNumber /= 2
    anyNumber %= 2
    //Operadores y desincrementador
    anyNumber++
    anyNumber--
    println(anyNumber)
    //Operadores logicos
    var isTrue : Boolean = true
    var isFalse : Boolean = false
    //Operadores Booleanos logicos
    //AND
    println(isTrue && isFalse)
    // OR
    println(isTrue || isFalse)
    //NOT
    println(!isTrue)
    helloWorld()
    var myNumber : Int = dobletheValue(2)
    println(myNumber)
    favoriteFoodPrompt("Marcos", "Sushi")
    favoriteFoodPrompt()
}

fun helloWorld(){
    println("Hello World")
}

fun dobletheValue(numberValue: Int) : Int {
    return numberValue * 2
}

fun favoriteFoodPrompt(name : String= "Anonymous", favoriteFood : String = "Pizza") : Unit {
    println("$name's Favorite food is $favoriteFood")
}