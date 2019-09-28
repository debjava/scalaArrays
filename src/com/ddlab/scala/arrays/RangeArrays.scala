package com.ddlab.scala.arrays

object RangeArrays {
  def main(args: Array[String]): Unit = {
    var array1 = Array.range(10,20,2);//10 to 20 incremented by 2
    for(i <- array1) {
      println("Value: "+i);//10,12,14,16,18,20
    }
  }
}