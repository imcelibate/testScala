package TestCodes

import scala.util.control.Breaks._

import TestCodes.implicitClassTest.TestClass3Implicit

object AmmaGuruMain {
  var intro : Int = _
  def main(args: Array[String]) {
  
    println("AMMMA GURUVEY")
    var myAmma:String = "Amma Guru"
    println(s"$myAmma")
    myAmma = "AMMA GURU999"

    case class Ashram(id: Int, name: String)
    val ashramObj : Ashram = Ashram(1,"CLT");
    println("Value ::::: "+ s"Id = ${ashramObj.id} , name= ${ashramObj.name}");

    println("Step 1: A simple for loop from 1 to 5 inclusive")
    for(numberOfDonuts <- 1 to 5){
      println(s"Number of donuts to buy = $numberOfDonuts")
    }

    val ashramList= List("CLT","KLM","BGLR","ALPH")
    for(name1 <- ashramList if name1 == "CLT"| name1 == "ALPH"){
      println(s"Found sweetening ingredient = $name1")

    }

    for(numberOfDonuts <- 1 until  5){
      println(s"Number of donuts to buy 2 = $numberOfDonuts")
    }

    val result = checkIt(-10)
    println ("Result" + result)

	//Method that dont return any thing, also having unit in function defenition
    methd(1)
	
	//Method that dont return any thing, also not having unit in function defenition
	println("NO return ...."+noReturn(9999));

	//Method that  return specific type
    val res = defName(200)
    println(res)
	
	//Method that  return specific type also value initialized in method parameter
    val res1 = defName()
    println(res1)

	//Method that  return any type
    println(defNameAnyType("word"));
    println(defNameAnyType("nbr").toString.toInt+1);

	//Method that return any type without return key word	
	println(returnWithEqual(9999999));
	println(returnWithEqualAny(0));

    //Method that break a loop
    defBreak();
	
	//Method recursion
    println("Starting recursion ...");
    defRecursion(20);
    
	  //Passing function as an argument   
    println(outerFunc(2,innerFunc))
    println(outerFunc(0,innerFunc))
    
	  //function currying    
    testFunCurry();
    
    //function with Option , Some, None
    println(calculateDonutCost("Glazed Donut", 5, None))
    println(calculateDonutCost("Glazed Donut", 5, Some("AMMA")))
    
    //function with Option and null pointer exception
    optionNull(Some("text from Amma"));
    optionNullHandling(None);
    // optionNull(None); un comment to test null pointer exception
    
    var re : Option[String] = optionReturn("AMMA");     
    println(s"${re.getOrElse("NO Coupon")}")
    re match {
     case Some(couponCode) => println(s"Today's coupon code = $couponCode")
     case None => println(s"Sorry there is no coupon code today!")
    }
   
//function with Option as return and various handeling of Null
    re = optionReturn("invalid");    
    println(s"${re.getOrElse("NO Coupon")}")
    re match {
     case Some(couponCode) => println(s"Today's coupon code = $couponCode")
     case None => println(s"Sorry there is no coupon code today!")
    }
    
    val tc = new TestClass();
    
    //Function testing implicit function
    implicit val pi : Double = 3.14
  //  implicit val pi1 : Double = 3.14
    print(s"Circunmfeerecne : ${tc.implicitDef(999)}")
    
    //typed function or methode override 
    print(tc.sameNameTypedfun(1111))
    print(tc.sameNameTypedfun("AMMA GURU"))
    
    //Generic typed function   
    tc.genericTypedFunction(99.99)
    tc.genericTypedFunction("AMMA GURU")
    tc.genericTypedFunction(tc)
    
    //Variable argument
    tc.variableArg("AMMA","GURU","DEVI","MATHA")
    tc.+++("MY DEAR AMMA")
    
    // Test class TestClass1
    val obj = new TestClass1("Mata","Ammachi")
    obj.printVars
    
    val obj2 = TestClass1("My AMMA","My GURU")
    obj2.printVars
    
    //Companion calss with some value initiated -- didnt work
    val obj3 = TestClass2("Calicut Ashram",Some("Amritha Nagar"))
    obj3.printDetail
    
    val obj4 = TestClass2("Kollam Ashram")
    obj4.printDetail
    
     val obj5 = TestClass3("Kollam Ashram 1st block", Some(40))
      obj5.printdtl
      
     val obj6 = TestClass3("Kollam Ashram Kalari block")
     obj6.printdtl
     
     println("Printing from main class a kind of getter: obj6.ASHRAMname : "+obj6.ASHRAMname)
     println("Printing from main class a kind of getter: obj6.yearBuilt : "+obj6.yearBuilt)
    
    //Implicit class test     
     val obj7  : TestClass3Implicit = implicitClassTest.TestClass3Implicit(obj6);    
      println("Implicit Class test id value  : "+ obj7.id); 
      
      val obj8  : TestClass3Implicit = implicitClassTest.TestClass3Implicit(obj5);    
      println("Implicit Class test id value : "+ obj8.id);
 }
  
 object TestClass1 {

 def apply(AMMA: String , GURU: String): TestClass1 = {
   new TestClass1(AMMA, GURU)
 }
  
} 
 
 object TestClass2 {
   
   private val tempVal = 999

 def apply(ASHRAM: String, place: Option[String]): TestClass2 = {
   new TestClass2(ASHRAM, place)
 }
 
  def apply(ASHRAM: String): TestClass2 = {
   new TestClass2(ASHRAM)
 }
  
}  


  def checkIt (a:Int)  =  {
    var aa = 100
    if (a >= 0) {
      (aa + a+  20)
    }
    else {
      (aa-a-20)
    }

  }

//Method that dont return any thing
def methd(acb:Int): Unit ={
  var a = 10                     // Initialization
  while( a<=20 ){                // Condition
    println(a)
    a = a+2                        // Incrementation
  }
}

//Method that  return specific type
  def defName(a:Int = 15):Int = {
    var aa=a
    aa = aa+10
    return aa
  }

//Method that  return any type 
  def defNameAnyType(a:String):Any = {
    if(a == "word"){
      var aword = "AMMA";
      return aword;
    }
    else{
      var anumber = 999;
      return anumber;
    }

  }

//Method that break
  def defBreak(){
    breakable{
      var a = 1
      while( a<=20 ){
        println(a)
        a = a+1
        if(a == 10){
          println("Going to break...")
          break
        }
      }

    }
  }


  //Method recursion
  def defRecursion(a: Int){

    println("print :"+a);
    if(a > 0)
    defRecursion(a-1);

  }

//Method that return nothing
  def noReturn(a:Int = 15){
    var aa=a
    aa = aa+10
  }

  def returnWithEqual(a:Int = 15)={
    var aa=a
    aa+10
    aa
  }

  def returnWithEqualAny(a:Int = 15): Any ={
    if(a > 0){
      var aa=a
      aa = aa+10
      aa
    }else{
      "non a number"
    }
  }


  def outerFunc(a : Int, f:Int => Any) = {

    println("Printing Function as parameter")

    var fromInnerFunc = f(a);
    fromInnerFunc

  }

  def innerFunc(a : Int) = {
    if(a > 0){
      a * 100
  }
    else{
      "Cannot Multiply"
    }

  }

  def testFunCurry() = {
    var result = add(10)(10)
    println("10 + 10 = "+result)
    var addIt = add(10)_
    var result2 = addIt(3)
    println("10 + 3 = "+result2)
  }

  def add(a:Int)(b:Int) = {
    a+b
  }


  def calculateDonutCost(donutName: String, quantity: Int, couponCode: Option[String]): Double = {
    println(s"Calculating cost for $donutName, quantity = $quantity")

    couponCode match {
      case Some(coupon) =>
        val discount = 0.1 // Let's simulate a 10% discount
      val totalCost = 2.50 * quantity * (1 - discount)
        totalCost

      case None => 2.50 * quantity
    }
  }
  
  def optionNullHandling(a : Option[String]): Unit = {
    val sample: Option[String] = a;
    println(s"Option with null check test : ${sample.getOrElse("Deafault value to protect null")}");
    
  }
  
  def optionNull(a : Option[String]): Unit = {
    val sample: Option[String] = a;
    println(s"Option with null check test : ${sample.get}");
    
  }
  
    def optionReturn(a : String): Option[String] = {
    
    if(a == "AMMA"){
      val couponFromDb = "COUPON_1234"
       Option(couponFromDb).filter(_.nonEmpty)
      }
    else{
      None
    }
    
  }
    
    
  
  
}