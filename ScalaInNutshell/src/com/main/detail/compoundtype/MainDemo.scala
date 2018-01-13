package com.main.detail.compoundtype

object MainDemo {
  def main(args: Array[String]){
    //greet(new A) //cannot do that, A = Hello
    greet(new B) //can: B = Hello + Bye
  }
  
  def greet(hb: Hello with Bye): Unit = {
    hb.hello;hb.bye
  }
}