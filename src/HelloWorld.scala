

object HelloWorld {
  def main(args: Array[String]):Unit = {
    println("Hello world"); 
    
    //stringOperations();
    var returnVal = loopOperations(5, "string" );
    println("Area of circle: " + circleArea());
    println("Area of circle with radius 5: " + circleArea(5));
   
  }
  
  // try default function parameters 
  def circleArea( radius:Float = 1) : Float = {
    var pi : Float = 3.14f;
    return pi*radius*radius;
  }
  //loop operations
  def loopOperations( arg1:Int, arg2:String) : Int = {
    var myArray = Array(4,5,6,7,23,45,67);
    for ( x <- myArray ){
      print(x + " ");
    }
    println();
    /*for (i =0; i<myArray.length; i++){

    }
 */ 
    return myArray.length;
    }
  
  // method to test diff string operations
  def stringOperations(){
  //def strinDemos() : Unit = { this is another way to tell that you're not going to return anything 
    var myVar : String = "string variable"    
    println(myVar)
    
    myVar = "new value";
    println(myVar);
    
    val myVal = "immutable string";
    println(myVal);
    
    //myVal = "new value for myVal";
    //println(myVal);    lines after this will not be executed if above line is uncommented
  
    println("before: " + myVar);
    myVar.concat("test");
    println("after: " + myVar);
    println(myVar.concat(" test"));
    
    println(myVar.equals("new value"));
    println(myVar.equalsIgnoreCase("new VALUE"));
    
    
  }
}