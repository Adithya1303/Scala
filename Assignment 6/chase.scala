

object chase {
  
  
   def main(args:Array[String])
{
    val a = Point(2,3)

    val b = Point(3,6)

    val c = a + b

    val d = a.move(3,5)

    val e = b.invert()

    val distance = a.distance(5,4)



   

    println(a)

    println(b)

    print(" 1 : Add two points")

    println(c)

    print(" 2 : move a point")

    println(d)

    print(" 3 : Get the reverse cordinates")

    println(e)

    print(" 4 : Get the distance of two points ")

    println(distance)
}
	



case class Point(i:Int,j:Int){

    def x:Int = i;

    def y:Int = j;

    def +(that:Point) = Point(this.x+that.x,this.y + that.y)

    def move(dx:Int,dy:Int) = Point(this.x + dx,this.y+dy)

    def distance(dx:Int,dy:Int): Double = scala.math.sqrt(scala.math.pow(this.x - dx, 2) + scala.math.pow(this.y - dy, 2))

    def invert() = Point(this.y,this.x)

}
}