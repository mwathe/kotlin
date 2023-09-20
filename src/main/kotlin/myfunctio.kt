fun Alan(){
    val myname ="Alan"
    println("My name is $myname")
}
fun main(args: Array<String>) {
    Alan()
//    calling fun
majina("Alano",  "Mwathe",  40)
majina("ken",  "mwiti",  30 )
eac("Kenya", "Kiswahili",  47)
eac("Uganda","Buganda", 34)
eac("Tanzania", "Swahili", 57)
eac("Ethiopia","Amharic", 49)
eac("Somalia","Somali",32)
}

fun majina(fname:String, lname:String, age:Int){
    println("my name is $fname + $lname and Im  $age old")
}

fun eac(country: String, language: String, population: Int){
    println("$country speak $language no of people is $population M")
}