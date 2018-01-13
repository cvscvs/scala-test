package com.main.core.futures.promise
import concurrent.Promise
case class TaxCut (reduction: Int)  {
  println(s"has ha $reduction")
}
// either give the type as a type parameter to the factory method:
//val taxcut = Promise[TaxCut]()
// or give the compiler a hint by specifying the type of your val:
//val taxcut2: Promise[TaxCut] = Promise()