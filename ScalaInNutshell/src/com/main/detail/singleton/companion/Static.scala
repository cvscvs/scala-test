package com.main.detail.singleton.companion

class Static {
  import Static._
  
  def blah = foo
}

object Static{
  private def foo = 42
  
  def main(args: Array[String]){    
    println(foo)
  }
}

