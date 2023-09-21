class Example{
    //data member
    var number:Int=5

//    member function
     fun calculatesquare():Int{
         return number*number
     }
}

fun main(args: Array<String>) {
//     create an object of Example Class
    val myobj=Example()
    println("The square of ${myobj.calculatesquare()}")
}