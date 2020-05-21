

object show {
  
  def main(args:Array[String])
  {  
     var x:Int=60
	   var y=x-50
	
	if(y>0)
	{
		var a:Double=24.95*1.4
		var b:Double=a*x
		var z:Double=y*0.75+3
		var q:Double=b+z
		println(q)
	}
	else
	{
		var a:Double=24.95*x*1.4+3
		println(a)
		
	}
  }  
}
