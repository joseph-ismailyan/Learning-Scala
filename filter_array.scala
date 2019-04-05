// filter out elements less than delim
object filter_array extends Any{
	def main(args: Array[String]): Unit = {
	  
		val delim = 3
		val arr = List(4,7,3,9,0,2,1)


	 	def f(delim:Int,arr:List[Int]): List[Int] = {
	 		for(i <- arr if i < delim ) yield i
		}

	  println(f(delim, arr))
	}
	
	
}