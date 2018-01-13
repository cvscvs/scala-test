package com.main.demo.traits

abstract class Spacecraft{
  def engage(): Unit
}

trait CommandoBridge extends Spacecraft{
  def engage(): Unit = {
    for(_ <- 1 to 3){
      speedUp()
    }
  }
  def speedUp(): Unit
}

trait PulseEngine extends Spacecraft{
  val maxPulse: Int
  var currentPulse: Int = 0
  
  def speedUp(): Unit = {
    if(currentPulse < maxPulse)
      currentPulse += 1
  }
}

class StartCruiser extends Spacecraft
                          with CommandoBridge
                          with PulseEngine
                          {
  val maxPulse = 200
}