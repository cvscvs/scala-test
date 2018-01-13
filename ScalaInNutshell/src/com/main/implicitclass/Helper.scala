package com.main.implicitclass

object Helper {
  def main(args: Array[String]){
    val cls = IntWithTime(100)
    println(cls)
  }
  
  
  implicit class IntWithTime(x: Int){
    def times[A](f: => A): Unit = {
      def loop(current: Int): Unit = {
        if(current > 0){
          f
          loop(current - 1)
        }
        loop(x)
      }
    }
  }
  
  
}