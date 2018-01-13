package com.main.detail.annotation

import scala.annotation.tailrec

object MainDemo {
  def main(args: Array[String]){
//    println(hello)  
    
     println(factorial(2))
  }
  
  @deprecated
  def hello = "Hello"
  
  def factorial(x: Int): Int = {
    @tailrec
    def factorialHelper(x: Int, accumulator: Int): Int = {
      if(x == 1) accumulator else factorialHelper(x-1, accumulator * x)
    }
    factorialHelper(x, 1)
  }
}