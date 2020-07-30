

object q3 {
  
  def main(args:Array[String])={
    var a1 = new Account("981602838v",1234,10000);

    var a2 = new Account("987654321v",1256,15000);

    println(a1)

    println(a2)



    //operations

    a1.withdraw(2000);

    println("------After withdrawing------")

    println(a1)

    a1.deposit(5000);

    println("------After depositing-------")

    println(a1)

    a1.transfer(a2,3000);

    println("------After transfering------")

    println(a1)

    println(a2)
  }
  
}


class Account(id:String,n:Int,b:Double){

    val nic:String = id

    val acnumber:Int = n

    var balance:Double = b



    def withdraw(a:Double)= this.balance = this.balance - a



    def deposit(a:Double) = this.balance = this.balance + a



    def transfer(a:Account, b:Double){

        a.balance += b;

        this.balance -=b;

    }



    override def toString = "[ "+nic+" : "+acnumber+" : "+balance+" ]";

}