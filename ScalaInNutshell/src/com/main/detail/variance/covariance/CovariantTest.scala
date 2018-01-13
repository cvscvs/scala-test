package com.main.detail.variance.covariance

object CovariantTest extends App{
  def printAnimalNames(animals: List[Animal]): Unit = {
    animals.foreach{
      animal => println(animal.name)
    }
  }
  
  val cats : List[Cat] = List(Cat("Whisker"), Cat("Tom"))
  val dogs : List[Dog] = List(Dog("Akmao"), Dog("ADam"))
  
  printAnimalNames(cats)
  printAnimalNames(dogs)
}