
class rational(a: Int, b: Int) {

  def numer = a

  def denom = b

  def neg=new rational(-this.numer,this.denom)

  override def toString = numer + "/" + denom

};


object q1 {
   def main(args:Array[String])={

    println("Enter numberator: ")

    var numerator=scala.io.StdIn.readInt()

    println("Enter denominator: ")

    var denominator=scala.io.StdIn.readInt()

    var obj =new rational(numerator,denominator);

    println(obj.neg)

  }


}