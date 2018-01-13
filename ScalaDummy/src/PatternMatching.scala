

class PatternMatching {
  def syntax(x: Int):String={
    x  match{
      case 0 => "zero"
      case 1 => "one"
      case _ => "many"
    }
  }
}