package TestCodes

import scala.util.control.Breaks._

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
}