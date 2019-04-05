// filter out odd indexed elements
object filter_positions_in_list {
	def main(args: Array[String]): Unit = {

		val arr = List.range(1,10)

		def f(arr:List[Int]): List[Int] = {
			var temp = List[Int]()
			for( i <- 1 until arr.length if (i % 2 == 1 )) (temp = temp :+ arr(i))
			return temp
		}

		println(f(arr))
	}
	
}