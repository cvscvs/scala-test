package com.main.demo.patternmatching

object FurnitureDemo {
  def main(args: Array[String]){
    val furniture = Chair() //Couch()
    println(findPlaceToSit(furniture))
  }
  
  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }
}