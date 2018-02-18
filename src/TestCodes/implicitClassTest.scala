package TestCodes

object implicitClassTest {
  
     implicit class TestClass3Implicit(testClass3 : TestClass3){
     
     val id = testClass3.ASHRAMname+'-'+testClass3.yearBuilt.getOrElse("0000")
   }
}