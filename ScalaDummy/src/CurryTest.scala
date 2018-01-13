

class CurryTest {
  def filter(xs: List[Int], p: Int=>Boolean):List[Int]={
    if(xs.isEmpty){
//      println("xs "+xs)
      xs
    }
    else if(p(xs.head)){
//      println(":: head, tail "+(xs.tail))
      xs.head :: filter(xs.tail,p)
    }
    else {
//      println("else tail "+filter(xs.tail,p))
      filter(xs.tail,p)
    }
  }
  
  def modN(n:Int)(x: Int)=((x%n)==0)
  
  
}