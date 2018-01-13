package com.main.detail.typebound.view

object ScalaViewBoundsTest {
  def main(args: Array[String]){
    val p1 = new Person("Rams", "Posa")
    val p2 = new Person("Chitpu", "Charan")
    
    println(p1.greater)
    println(p2.greater)
  }
}