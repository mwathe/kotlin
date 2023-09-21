class Cars{
    var type=""
    var color=""
    var cc=0
}

fun main(args: Array<String>) {
    val myobj5=Cars()
    myobj5.type="Subaru"
    myobj5.color="White"
    myobj5.cc=2000
    println(myobj5.type)
    println(myobj5.color)
    print(myobj5.cc)

    println("${myobj5.type}that is my ${myobj5.color} and ${myobj5.cc} is my Favourate")
}