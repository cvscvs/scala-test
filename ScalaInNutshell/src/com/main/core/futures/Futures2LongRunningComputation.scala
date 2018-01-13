package com.main.core.futures

import scala.concurrent.{Await, Future, future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Futures2LongRunningComputation extends App {
  implicit val baseTime = System.currentTimeMillis

    def longRunningComputation(i: Int): Future[Int] = future {
        Thread.sleep(100)
        i + 1
    }

    // this does not block
    longRunningComputation(11).onComplete {
        case Success(result) => println(s"result = $result")
        case Failure(e) => e.printStackTrace
    }

    // important: keep the jvm from shutting down
    Thread.sleep(1000)
}