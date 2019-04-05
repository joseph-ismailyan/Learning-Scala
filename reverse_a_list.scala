// read a list and output a list with the order reversed
object reverse_a_list{
	def main(args: Array[String]): Unit = {
	  
		val list = List.range(1,5)

		def f(arr:List[Int]): List[Int] = {
			var temp = List[Int]()
			for(i <- (arr.length - 1) to 0 by -1) temp = temp :+ arr(i)

			return temp
		}
	println(f(list))
	}
	
}