// return the abosolute value of a list
object update_list {
	def main(args: Array[String]): Unit = {

		val list = List.range(-5,-1)

		def f(arr:List[Int]): List[Int] = {
			var temp = List[Int]()
			for(i <- 0 until arr.length) temp = temp :+ math.abs(arr(i))

			return temp
		}
		println(f(list))
	}
}