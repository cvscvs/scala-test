package com.main.detail.implicitconversion

object Parse {
  def foo(s: MyString)  = s.camelize
  def main(args: Array[String]){
    val x = foo("active_record")
    println(x.toString)
  }
}