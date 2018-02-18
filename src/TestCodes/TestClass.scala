package TestCodes

class TestClass {
  
  def implicitDef(rad : Int)(implicit pi : Double):  Double = {
     2*rad*pi;
  }
  
 def sameNameTypedfun(aa : Int): Unit = {
   print(s"Inside function wih Int : ${aa}")
 }
 
  def sameNameTypedfun(aa : String): Unit = {
   println(s"Inside function wih String : ${aa}")
 }
  
    def genericTypedFunction[T](aa : T): Unit = {
      aa match{
        case aa : String => {
             println(s"Inside function wih String : ${aa}")          
        }
        case aa : Double => {
             println(s"Inside function wih Double : ${aa}")          
        }
        case _ => {
             println(s"Inside function wih wildCart : ${aa}")          
        }
      }
 }
    
     def variableArg(names: String*): Unit = {
       
       println(s"Amma names= ${names.mkString(", ")}")
       
     }
     
     def +++(name: String): Unit = {
       
       println("Amma in symbol method :"+name)
       
     }
  
}