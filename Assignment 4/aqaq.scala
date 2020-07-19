

object aqaq {
  
  def main(args:Array[String])
  {
    val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    
    val A=(c:Char,key:Int,p:String)=>p((p.indexOf(c.toUpper)+key)%p.size)
    val B=(c:Char,key:Int,p:String)=>p((p.indexOf(c.toUpper)-key+p.size)%p.size)
    val ciepher=(algo:(Char,Int,String)=>Char,s:String,key:Int,p:String)=>s.map(algo(_,key,p))
    var w=scala.io.StdIn.readLine("Secret Messege:")
    print("Encrypt by: ")
    var f=scala.io.StdIn.readInt()
    
    print("Decrypt by: ")
    var r=scala.io.StdIn.readInt()
    
    var Encrypt=ciepher(A,w,f,alphabet)
    var Decrypt=ciepher(B,Encrypt,r,alphabet)
    println(Encrypt)
    println(Decrypt)
  }

}