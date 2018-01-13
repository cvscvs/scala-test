package com.sna.classes

object ComplexNumber {
  def main(args: Array[String]){
    val c = new Complex (1.2, -3.4)
    println("imaginary part: " + c.im())
    println("real part: " + c.re())
    print(c.toString())
  }
}