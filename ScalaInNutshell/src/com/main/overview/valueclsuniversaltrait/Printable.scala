package com.main.overview.valueclsuniversaltrait

trait Printable extends Any {
  def print(): Unit = println(this)
}