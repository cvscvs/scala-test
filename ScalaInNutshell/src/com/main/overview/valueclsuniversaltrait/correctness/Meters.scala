package com.main.overview.valueclsuniversaltrait.correctness

class Meters (val value: Double) extends AnyVal{
  def +(m: Meters): Meters = new Meters(value + m.value)
}