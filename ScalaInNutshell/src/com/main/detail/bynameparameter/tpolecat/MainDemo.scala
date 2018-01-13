package com.main.detail.bynameparameter.tpolecat

object MainDemo {
  def main(args: Array[String]){
      /*** ==== all by-value parameters examples ==== ***/
//    println(when(1 ==2, "foo", "bar"))
//    println(when(1 ==1, "foo", "bar"))
//    when(1==2, println("foo"), println("bar"))//foo and bar => why not only bar???
//    when(1==1, println("foo"), println("bar"))
    
      /*** ==== all by-name parameters examples ==== ***/ 
      when(1==2, println("foo"), println("bar")) //only bar
      when(1==1, println("foo"), println("bar"))
  }
  
  //by-value parameters
  /*def when[A](test: Boolean, whenTrue: A, whenFalse: A):A = test match {
    case true => whenTrue
    case false => whenFalse
  }*/
  
  //by-name parameters
  def when[A](test: Boolean, whenTrue: => A, whenFalse: => A):A = test match {
    case true => whenTrue
    case false => whenFalse
  }
}