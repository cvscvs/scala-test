package com.main.overview.valueclsuniversaltrait.correctness

object Demo {
  def main(args: Array[String]){
    val x = new Meters(3.4)
    val y = new Meters(4.3)
    val z = x+y
    println(z)
  }
}