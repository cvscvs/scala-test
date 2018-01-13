package com.main.detail.typebound.upper

object ScalaUpperBoundTest  {
  def main(args: Array[String]){
    val animal = new Animal
    val dog = new Dog
    val puppy = new Puppy
    
    val animalCarer = new AnimalCarer
    
//    animalCarer.display(animal)
    animalCarer.display(dog)
    animalCarer.display(puppy)
  }
}