object Factorial{

	def main(args: Array[String]): Unit = {

		if((args.length == 1) && (args(0).toInt < 15)) val fac = args(0)
		else val fac = 4

		printf("\n%d! is %d.\n", fac, factorial(fac))
		println(args(0).toInt)
		//println(factorial(args(0).toInt))
	}

	def factorial(x: Int): Int = {

		if(x==0)
			return 1
		else
			return x*factorial(x-1)
	}

}