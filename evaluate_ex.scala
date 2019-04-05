object evaluate_ex {
	def main(args: Array[String]): Unit = {
	  
	 	val num = List(20.0000, 1.0000)

	 	def f(arr:List[Int]): Unit = {
	 		for(n <- arr; x <- 0 to 11) println("%.4f".format((0 until 10).map(f=>(math.pow(n,x))/factorial(n)).sum))
	 	}
	}
	
}