class Fruits{
    var type=""
    var color=""
    var price=0
}

fun main(args: Array<String>) {
    // create object
    val myobj2=Fruits()
    myobj2.type="Banana"
    myobj2.color="Green"
    myobj2.price=20
    println(myobj2.type)
    println(myobj2.color)
    println(myobj2.price)
}