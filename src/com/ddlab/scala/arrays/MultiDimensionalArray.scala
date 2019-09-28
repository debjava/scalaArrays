package com.ddlab.scala.arrays

object MultiDimensionalArray {
  def main(args: Array[String]): Unit = {
    var myMatrix = Array.ofDim[Int](3, 3)

    // build a matrix
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // Print two dimensional array
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));
      }
      println();
    }
  }
}