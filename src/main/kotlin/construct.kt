class Student(val name:String, var Age:Int, var Gender: String){

}

fun main(args: Array<String>) {
    // create object
    val stu1=Student( "Ken",30,"Male")
    val stu=Student("Petr", 47,"female")
    println("Student name is ${stu.name} , age is ${stu.Age} and is ${stu.Gender}")
    println("Student name is ${stu1.name} , age is ${stu1.Age} and is ${stu1.Gender}")
}