package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, $name!")

    val message="Hello, Kotlin!"
    val reverseMessage= message.reversed()
    println(reverseMessage)

    var aNumber=2
    aNumber=4
    println(aNumber)

    val numbers: List<Number?> = listOf(1, 2, null)
    println(numbers)

    val otherNames: List<String?> = listOf("Kat", "Marc", null)

    // Loop on each name in the list
        for (name in otherNames) {
            // Print the length
            println(name?.length)
        }

    val number = "3".toInt()
    println(number)

    val listOfThings: List<Any> = listOf(3, "Hello", 4)
    println(listOfThings)

    fun add(a: Int, b: Int): Int {
        return a + b
    }
    println(add(2, 3))

    fun superify(word: String):String=
        "super$word"

    println(superify("Hello"))

    fun revealSecret(passcode: String):String? {
        val secret = "The cookies are in the desk drawer"
        if (passcode == "Hungry") {
            return secret
        } else {
            return null
        }
    }

   fun getNumberSign(inputNumber:Any):String?{
       if (inputNumber !is Int){
           return null
       }
       if (inputNumber > 0){
           return "positive"
       } else if(inputNumber == 0){
           return "zero"
       } else {
           return "negative"
       }
   }

    fun getAllNumberSigns(numbers: List<Number>):List<String?>{
        return numbers.map {
            getNumberSign(it)
        }
    }

    fun printHelloMessage(name:List<String>){
        name.forEach{
            println("Hello $it")
        }
    }

    fun convertToCaps(letter:String):String{
            return letter.uppercase()
        }
    fun exclaim(letter:String):String{
        return "$letter!"
    }

    fun greetWith(
        name:String,
        transform:(String)-> String
    ):String{
        return transform(name)
    }

    println(revealSecret("Hungry"))
    println(revealSecret("Hi"))
    println(getNumberSign(2))
    println(getNumberSign(0))
    println(getNumberSign(-3))
    println(getNumberSign("hello"))
    printHelloMessage(listOf("Jake", "Olga", "Pat"))
    println(
        getAllNumberSigns(
            listOf(2, -3, 5, 0)
        )
    )
    println(
        greetWith(
            "Marco",
            ::convertToCaps
        )
    )

    println(
        greetWith(
            "Marco",
            ::exclaim
        )
    )
    println(
        greetWith("Marco") {
            it.reversed()
        }
    )
    }
