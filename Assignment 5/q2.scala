
import scala.io.StdIn._

object q2 {
   def main(args:Array[String])={
    val x = new Rational(3, 4)

    val y = new Rational(5, 8)

    val z = new Rational(2, 7)

    println(x + " - " + y + " - " + z + " = " + (x-y-z))
   }
}


class Rational(x:Int, y:Int){

    private def gcd(a:Int, b:Int): Int = if(b == 0) a else gcd(b, a%b)

    private val g = gcd(x, y)

    def numer = x/g

    def denom = y/g

    def +(r: Rational) = new Rational(this.numer*r.denom + r.numer*this.denom, denom*r.denom)

    def neg = new Rational(-this.numer, this.denom)

    def -(r: Rational) = this + r.neg

    override def toString = numer + "/" + denom;

} 