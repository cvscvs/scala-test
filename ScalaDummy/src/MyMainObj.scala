import scala.util.Random


object MyMainObj {
  def main (arrgs : Array[String]){
    /*val myCls = new MyClass(2,3)
    myCls.x
    println(myCls)*/
    
    /*val gs = new GetterSetter
    gs.x = 99
    gs.y = 101*/
    
    /*def apply(f: Int => String, v: Int) = f(v)
    val decorator = new HighOrderFn("[", "]")
    println(apply(decorator.layout, 7))*/
    
    /*val arrgs = new NestedFn()
    println("factorial 2 "+arrgs.factorial(2))
    println("factorial 3 "+arrgs.factorial(3))
    */
    
   /* val curry = new CurryTest();
    val nums = List(1,2,3,4,5,6,7,8)
    println(curry.filter(nums, curry.modN(2)))
    println(curry.filter(nums, curry.modN(3)))
    */
    /*val caseCls = CaseCls("has ah") 
    println("case class "+caseCls.isbn)
    */
    
    
    /// pattern matching
    val patternMatching = new PatternMatching()
    println(patternMatching.syntax(Random.nextInt(1)))
  }
}