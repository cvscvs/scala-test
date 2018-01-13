package com.main.core.futures

import scala.concurrent.{Future, future}
import scala.util.Random
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Cloud {
  def runAlgorithm(i: Int): Future[Int] = future {
      Thread.sleep(Random.nextInt(500))
      val result = i + 10
      println(s"returning result from cloud: $result")
      result      
  }
}