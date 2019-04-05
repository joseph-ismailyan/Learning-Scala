// returns the sum off the odd-valued elements
object sum_odd_elements {
	def main(args: Array[String]): Unit = {
	  
		val list = List(3,2,4,6,5,7,8,0,1)

	 	def f(arr:List[Int]): Int = {
	 		var sum = 0
	 		for(i <- 0 until arr.length if (math.abs(arr(i) % 2) == 1)) sum += arr(i)
	 			
	 		return sum
		}
		printf("sum is: %d", f(list))
	}
	
}