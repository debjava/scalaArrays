package com.ddlab.scala.arrays

object TestArray1 {
  def main(args: Array[String]) {
    //Initialize an array
    var a: Array[String] = new Array[String](3);
    var i: Int = 0;
    for(i <- 0 until 3) {
      a(i) = "Value-"+i;
    }
    
    //Print the values
    var j: Int = 0;
    for( j <- 0 until 3) {
      println("Value of a : "+a(j));
    }
    
    //you can also define like this
    var z = Array("Zara", "Nuha", "Ayan")
    var k: Int = 0;
    for( k <- 0 until z.length) {
      println("Value of z : "+z(k));
    }
  }
}