//easier blog: https://alvinalexander.com/scala/scala-implicit-method-arguments-fields-example
package com.main.detail.implicitparam

object ImplicitTest {
  implicit object StringMonoid extends Monoid[String] {
    def add(x: String, y: String): String = x concat y
    def unit: String = ""
  }

  implicit object IntMonoid extends Monoid[Int] {
    def add(x: Int, y: Int): Int = x + y
    def unit: Int = 0
  }

  def sum[A](xs: List[A])(implicit m: Monoid[A]): A = {
    if (xs.isEmpty) m.unit
    else m.add(xs.head, sum(xs.tail))
  }

  def main(args: Array[String]) {
    println(sum(List(1, 2, 3))) //uses IntMonoid implicit
    println(sum(List("a", "b", "c"))) //uses StringMonoid implicit
  }
}