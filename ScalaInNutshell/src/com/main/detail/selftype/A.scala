package com.main.detail.selftype

trait A {
  this: B =>
    
}

/*
not like this
error:  illegal cyclic reference involving trait B
trait A extends B{

}


*/