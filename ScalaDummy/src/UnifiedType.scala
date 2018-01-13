

object UnifiedType {
  def main(arrays: Array[String]){
//    print("hello world")
    
    val list: List[Any] = List(
         "a String",
         732,
         'c',
         true,
         ()=> "an anonymous function returning a string"
       )
       
       list.foreach(element => println(element))
  }
}