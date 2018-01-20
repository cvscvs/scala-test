package com.main.overview.valueclsuniversaltrait.casecls

class ValueClass (val value: Int) extends AnyVal

case class ValueCaseClass(value: Int) extends AnyVal
class ValueClassTest{
  var x : ValueClass = new ValueClass(1)
  var y : ValueCaseClass = ValueCaseClass(2)
  
  def m1(x: ValueClass) = x.value
  def m2(x: ValueCaseClass) = x.value
}