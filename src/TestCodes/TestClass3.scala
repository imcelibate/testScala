package TestCodes

case class TestClass3 (ASHRAMname : String, yearBuilt : Option[Int] = None) {
  
  def printdtl = {
      println(s"ASHRAM Name : $ASHRAMname");
      println(s"Year Built : ${yearBuilt.getOrElse("UnKnown")}");
  }  
  
}