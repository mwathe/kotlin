import java.time.temporal.TemporalAmount
// parent class
open class  MobileMoneyAccount(
    val accountnumber: String,
    var balance: Double
)
{
    //function
    fun deposit(amount: Double){
        balance +=amount
    }
   open fun withdraw(amount: Double){
        if (balance>=amount){
            balance-=amount
        }else{
            println("Insuficient Balance")
        }
    }
  fun checkbalance():Double {
return balance

  }

}
  // child classes traits mpesa

class MpesaAccount(
    accountnumber: String,
    balance: Double,
    val phonenumber: String
):MobileMoneyAccount(accountnumber,balance){
 // checking tosend
    fun sendmoney(recepient: MpesaAccount, amount: Double){
        if (balance>=amount){
            balance-=amount
            recepient.deposit(amount)
            println("sent $amount KES to ${recepient.phonenumber}")
        }else{
            println("Insufficient amount")
        }
    }
    override fun withdraw(amount: Double){
        if (balance>=amount + 10.0){
            balance-=amount +10.0
            println("withdraw $amount KES(charges 10 KES)")
        }else{
           println("Insufficient Balance")
        }
    }
}

fun main(args: Array<String>) {
    val erick=MpesaAccount("2335474", 1000.0, "0701422765")
    val Jane=MpesaAccount("8596965",500.0, "07452374832")
    erick.sendmoney(Jane,200.0)
    println("Erick balance: ${erick.checkbalance()
    } KES")
    println("Jane balance: ${Jane.checkbalance()}Kes")

    erick.withdraw(amount = 300.0)
    println("Erick's balance : ${erick.checkbalance()} KES")
}