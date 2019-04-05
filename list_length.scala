// find length of list witout using built-in functions
object list_length {
	def main(args: Array[String]): Unit = {
	  
		val list = List.range(1,5)

		def f(arr:List[Int]):Int = {
			arr.map(_=>1).sum	
		}

		println(f(list))
	}	
}