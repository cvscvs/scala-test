package com.main.detail.operators

case class MyBool(x: Boolean) {
  def and(that: MyBool): MyBool = if(x) that else this
  def or(that: MyBool): MyBool = if(x) this else that
  def negate: MyBool = MyBool(!x)
  def not (x: MyBool) = x.negate
  def xor(x: MyBool, y: MyBool) =(x or y) and not (x and y) 
}