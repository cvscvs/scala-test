package com.generic

object MainDemo {
  def main(args: Array[String]){
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.push(3)
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
  }
}