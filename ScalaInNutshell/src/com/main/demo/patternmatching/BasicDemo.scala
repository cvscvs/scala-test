package com.main.demo.patternmatching
import scala.util.Random

object BasicDemo {
  def main(args: Array[String]){
    val x: Int = Random.nextInt(10)
    println(matchtest(1))
    
    
  }
  
  def matchtest(x: Int): String = x match{
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }
}