package com.main.detail.implicitparam

abstract class Monoid[A] extends SemiGroup[A] {
  def unit: A
}