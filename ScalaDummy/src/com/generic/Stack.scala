package com.generic

class Stack[A] {
  private var elements: List[A] = Nil
  def push(x: A){
    elements = x :: elements
  }
  def peek: A = elements.head
  def pop (): A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }
}