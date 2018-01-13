package com.main.detail.typebound.upper

class AnimalCarer {
  def display [T <: Dog](t: T){
    println(t)
  }
  
  def displayLower[T >: Dog](t: T){
    println(t)
  }
}