//url: https://twitter.github.io/scala_school/type-basics.html#inference
package com.main.detail.localtypeinference

object MainDemo {
  def main(args: Array[String]){
    val x = 1 + 2*3
    val y = x.toString()
    println(succ(x))
  }
  
  def succ(x: Int) = x + 1
}