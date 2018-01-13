package com.main.demo.highorderfn

case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
  private def convertCtoF(temp: Double) = temp * 1.8 + 32
  
//  def forecastInFahrenheit: Double = temperatures.map(convertCtoF(x:Double)) // <-- passing the method convertCtoF
}