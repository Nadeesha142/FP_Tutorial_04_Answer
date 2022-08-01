object PatternMatching{

	def main(args:Array[String])={

		println("Enter the Integer Number:");
		val num:Int=scala.io.StdIn.readInt();

		num match {
			case x if num<=0 => println("Negative/Zero")
			case x if num%2==0 => println("Even Number")
			case x if num%2!=0 => println("Odd Number")
		}
	}



}