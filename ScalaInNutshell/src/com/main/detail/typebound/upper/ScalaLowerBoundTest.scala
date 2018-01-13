package com.main.detail.typebound.upper

object ScalaLowerBoundTest {
  def main(args: Array[String]){
    val animal = new Animal
    val dog = new Dog
    val puppy = new Puppy
    val animalCarer = new AnimalCarer
    animalCarer.displayLower(animal)
    animalCarer.displayLower(dog)
    animalCarer.displayLower(puppy)
  }
}