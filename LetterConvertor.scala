object LetterConvertor{

	def main(args:Array[String])={

		var name=scala.io.StdIn.readLine("Enter the name:")
		println("\nThere are two choices you have\n 1.Uppercase\t 2.Lowercase\n\n Enter your choice number:")
		var num=scala.io.StdIn.readInt()


		def toUpper(text:String):String=text.toUpperCase()
		def toLower(text:String):String=text.toLowerCase()
		def formatNames(name:String)(func:String=>String):String=func(name)
		
		if(num==1){
			println(formatNames(name)(toUpper))
		}
		else if(num==2){
			println(formatNames(name)(toLower))
		}
		else
		{
			println("There are not matching format name for your choice")
		}
	}
}

