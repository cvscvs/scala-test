

class NestedFn {
    def factorial(x: Int):Int={
        def fact(x: Int, accumulate: Int): Int={
          if(x <= 1)accumulate
          else fact(x-1, x* accumulate)
        }
        fact(x,1)
    }
}