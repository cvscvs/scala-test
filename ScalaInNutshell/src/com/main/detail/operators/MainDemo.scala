package com.main.detail.operators

object MainDemo {
  def main(args: Array[String]){
    val vector1 = Vec(1.0, 2.0)
    val vector2 = Vec(3.0, 4.0)
    
    val vector3 = vector1 + vector2
    
    println(vector3.x)
    println(vector3.y)
  }
}