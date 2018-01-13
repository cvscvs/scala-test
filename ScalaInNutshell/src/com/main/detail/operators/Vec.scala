package com.main.detail.operators

case class Vec (val x: Double, val y: Double){
  def +(that: Vec) = new Vec(this.x + that.x, this.y + that.y)
}
