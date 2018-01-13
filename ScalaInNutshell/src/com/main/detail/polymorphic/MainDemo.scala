package com.main.detail.polymorphic

object MainDemo {
  def main(args: Array[String]){
    println(listOfDuplicates[Int](3, 0))
    println(listOfDuplicates("La", 8))
  }
  
  def listOfDuplicates[A](x: A, length: Int): List[A] = 
    if(length <1)
      Nil
    else 
      x :: listOfDuplicates(x, length-1) //:: used for list, right operand
}