package com.main.detail.typebound.view

import scala.math.Ordered

class Person[T <% Ordered[T]](val firstName: T, val lastName:T) {
  def greater = if(firstName < lastName)firstName else lastName
}