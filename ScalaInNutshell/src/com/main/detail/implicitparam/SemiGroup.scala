package com.main.detail.implicitparam

abstract class SemiGroup[A] {
  def add(x: A, y: A):A
}