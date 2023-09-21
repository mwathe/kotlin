open class Ourparent {
    val dad="Like watching Vicking"
    val mum="Like cooking"
}

class Boychild:Ourparent(){
    fun mvulana(){
        println(dad)
    }
}

class Girlchild:Ourparent(){
    fun msichana(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val myobj2=Boychild()
    myobj2.mvulana()
    val myobj3=Girlchild()
    myobj3.msichana()

}