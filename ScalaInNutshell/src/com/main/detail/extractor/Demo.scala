package com.main.detail.extractor

object Demo {
  def main(args: Array[String]){
    val customer1ID = CustomerID("veasna")
    
    customer1ID match{
      case CustomerID(name) => println(name)
      case _ => println("Could not extract a CustomerID")
    }
  }
}