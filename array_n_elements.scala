// fill an array with num elements
object array_n_elements {
	def main(args: Array[String]): Unit = {
	  
	  def f(num:Int): List[Int] = {
        val list = List.range(0,num)
        return list
    }

    for(int <- f(3)) println(int)
	}
	
	
}