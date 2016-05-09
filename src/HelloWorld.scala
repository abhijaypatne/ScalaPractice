

object HelloWorld {
  def main(args: Array[String]):Unit = {
    println("Hello world"); 
    
    //stringOperations();
    var returnVal = arrayOperations(5, "string" );
/*    println("Area of circle: " + circleArea());
    println("Area of circle with radius 5: " + circleArea(5));
    println("Area of rectangle: " + rectangleArea(width = 10, length=14)); 
    println("multiplier: " + multiplier(10));
    println("multiplie1: " + multiplier1(24, 10));
*/  }
  
  // closure
  val factor = 3.2f;
  val multiplier = (i:Int) => i * factor;
  var multiplier1 = (i:Int, j:Float) => i * j * factor;
  
  // try default function parameters 
  def circleArea( radius:Float = 1) : Float = {
    var pi : Float = 3.14f;
    return pi*radius*radius;
  }
  
  // named and default parameters
  def rectangleArea (length:Float=1, width:Float=2) : Float = {
    return length*width;
  }

  //loop operations
  def arrayOperations( arg1:Int, arg2:String) : Int = {
    var myArray = Array(4,5,6,7,230,23,23, 5,6,45,46,0, 46, 69, 67);
    for ( x <- myArray ){
      print(x + " ");
    }
    println();
    //count operation
    println("number of odd elements: " + myArray.count { x => (x%2!=0) });
    //exists
    println("does array contains number divisible by 5: " + myArray.exists {( x => (x%5==0) )});
    // filter
    println("numbers divisible by 23: " + myArray.filter { x => (x%23==0) }.toString());
    println("total numbers divisible by 23: " + myArray.filter { x => (x%23==0) }.length);
    println("unique numbers divisible by 23: " + myArray.filter { x => (x%23==0) }.distinct.length);
    //distinct
    var distinctArray = myArray.distinct;
    for ( x <- distinctArray ){
      print(x + " ");
    }
    println();
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