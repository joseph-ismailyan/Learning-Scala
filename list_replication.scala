// repeat elements in a list num times
object list_replication {
	def main(args: Array[String]): Unit = {
	  
		val num = 2
		val arr = List(2,3,4)

		def f(num:Int, arr:List[Int]): List[Int] = {
	  		arr.flatMap(List.fill(num)(_))
	  	}

	  println(f(num, arr))
	}
	
}