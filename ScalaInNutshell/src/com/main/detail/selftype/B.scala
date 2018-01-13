package com.main.detail.selftype

trait B {
  this: A =>
}


/**
error:  illegal cyclic reference involving trait A 

trait B extends A{
	

}


*/