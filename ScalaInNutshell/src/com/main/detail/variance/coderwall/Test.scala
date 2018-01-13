package com.main.detail.variance.coderwall

object Test extends App{
  def method1(box: Box1[Mammal]){}
  def method2(box: Box2[Mammal]){}
  def method3(box: Box3[Mammal]){}
  
  /*======= covariance : sub type =======*/
//  method1(new Box1[Animal]) //compile fail
  method1(new Box1[Mammal])
  method1(new Box1[Dog])
  
  /*======= cotravariance : super type =======*/
  method2(new Box2[Animal])
  method2(new Box2[Mammal])
//  method2(new Box2[Dog]) //compile fail
  
  
  /*======= invariance =======*/
//  method3(new Box3[Animal]) //compile fail
  method3(new Box3[Mammal])
//  method3(new Box3[Dog]) //compile fail
}