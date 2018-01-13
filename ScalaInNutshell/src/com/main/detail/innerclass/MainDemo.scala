package com.main.detail.innerclass

object MainDemo {
  def main(args: Array[String]){
    val a = new Outer
    val b = new Outer
    
    val aInner = new a.Inner
    val bInner = new b.Inner
    
//    aInner.foo(bInner) //mean: they are different type
  }
}