package com.main.detail.innerclass

class Outer {
  class Inner{
    def foo(x: Inner): Inner = this
  }
}