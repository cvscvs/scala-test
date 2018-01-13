class MyClass (var x: Int, var y: Int) {
  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }
  
  override def toString: String = 
    s"($x, $y)"
}

