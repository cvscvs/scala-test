

class HighOrderFn(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}