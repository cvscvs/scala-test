package com.main.demo.patternmatching

sealed abstract class Furniture
case class Couch() extends Furniture
case class Chair() extends Furniture

