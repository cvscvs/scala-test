package com.main.detail.localtypeinference

case class MyPair[A, B](x: A, y: B);
object InferenceTest3 {
  def main(args: Array[String]){
    def id[T](x: T) = x
    val p = MyPair[Int, String](1, "Scala")
    val q = id(1)
    
    println(p)
    println(q)
  }
}