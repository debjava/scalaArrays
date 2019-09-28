package com.ddlab.scala.arrays

object ConcatArrays {
  def main(args: Array[String]) {
    //Concatenate n arrays
    var array1 = Array(1,2,3,4,5);
    var array2 = Array(6,7,8,9,0);
    var array3 = Array(10,11,12,13);
    
    var concatedArrays = Array.concat(array1,array2,array3);
    for( i <- 0 until concatedArrays.length) {
      println("Value : "+concatedArrays(i));
    }
  }
}