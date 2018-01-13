package com.main.demo.highorderfn

object BasicScalaDemo {
  def main(args: Array[String]){
    val salaries = Seq(20000, 70000, 40000)
    /*val doubleSalary = (x: Int) => x*2
    val newSalaries = salaries.map(doubleSalary)*/
// or    val newSalaries = salaries.map(x=>x*2)
    val newSalaries = salaries.map(_*2)
    println(newSalaries)
  }
}