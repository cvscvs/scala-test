package com.main.core.futures

// ============ use Blocking feature ~~~ wait result with any duration

// 1 - the imports
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Futures1 extends App {

  // used by 'time' method
  implicit val baseTime = System.currentTimeMillis

  // 2 - create a Future
  val f = Future {
      Thread.sleep(2000)//after 2 seconds then start work
      1 + 1
  }

  // 3 - this is blocking (blocking is bad)
  val result = Await.result(f, 1 second) //wait result 1 second, so timeout issued
  println(result)
  Thread.sleep(1000)

}