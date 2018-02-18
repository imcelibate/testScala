package TestCodes

class TestClass2 (ASHRAM: String, place: Option[String] = None) {
  
  def printDetail = {
    println(s"ASHRAM name : $ASHRAM")
    println(s"place : ${place.getOrElse("PLace NA")}")   
    //println (s"tempVal = ${TestClass2.tempVal}")
  } 
  
}