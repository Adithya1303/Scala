
object q 
{
  def main(args:Array[String])
  {
   println("Enter the working hours:")  //enter ot and work hours in hours
   var wor=scala.io.StdIn.readInt()     //every week get 10% tax
   println("Enter the OT hours:")
   var ot=scala.io.StdIn.readInt()
   if(wor<=40||ot<=20)
   {
      var p=salary(wor,ot)
       println("Monthly salaray is Rs:"+p)
     
   }
   else if((wor>40||ot>20)&&(wor<=80||ot<=40))
   {
     var p=salary(wor,ot)
     var q=salary2(wor,ot)
     
     println("Monthly salaray is Rs:"+p)
   }
   else if((wor>80||ot>40)&&(wor<=120||ot<=60))
   {
     var p=salary(wor,ot)
     var q=salary2(wor,ot)
     var r=salary3(wor,ot)
     println("Monthly salaray is Rs:"+p)
     
   }
   else
   {
      var p=salary(wor,ot)
     var q=salary2(wor,ot)
     var r=salary3(wor,ot)
     var s=salary4(wor,ot)
     println("Monthly salaray is Rs:"+p)
   }
  
    
  }
  

     def salary(x1:Int,x2:Int):Float=
    ((x1*150)+(x2*75))*0.9F
    
 
     def salary2(x1:Int,x2:Int):Float= 
   ((x1-40)*150+(x2-20)*75)*0.9F
    
   
     def salary3(x1:Int,x2:Int):Float=
    ((x1-80)*150+(x2-40)*75)*0.9F
    
  
     def salary4(x1:Int,x2:Int):Float=
    ((x1-120)*150+(x2-60)*75)*0.9F
    
  
}