package com.ddlab.scala.arrays

object TestArray2 {

  def main(args: Array[String]): Unit = {
    var myArray = Array(1.2,2.3,3.4,4.5,5.6);
    //print the all the elements inside the array
    for( i <- myArray) {
      println("Value:"+i);
    }
    
    //Find the largest element;
    var large = myArray(0);
    
    for(j <- myArray) {
      if(j > large)
        large = j;
    }
    println("Largest :"+large);
    
  }
}