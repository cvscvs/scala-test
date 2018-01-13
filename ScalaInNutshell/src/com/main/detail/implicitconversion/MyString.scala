package com.main.detail.implicitconversion

class MyString(s: String){
  def camelize = s.split("_").map(_.capitalize).mkString
  
//  override def toString = s
}

object MyString {
  implicit def stringToMyString(s: String) = new MyString(s)
}