package com.main.demo.highorderfn

object SalaryRaiser {
  def smallPromotion(salaries: List[Double]): List[Double] = 
    salaries.map(salary => salary * 1.1)
  
  def greatPromotion(salaries: List[Double]): List[Double] =
    salaries.map(salary => salary * math.log(salary))
  
  def hugePromotion(salaries: List[Double]): List[Double] = 
    salaries.map(salary => salary * salary)
}