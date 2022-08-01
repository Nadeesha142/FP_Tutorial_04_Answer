object InterestCalculation extends App{

	def interest(deposit:Double):Double= deposit match{
		case x if x<0 =>0
		case x if x<20000 => x*0.02
		case x if x<200000 => x*0.04
		case x if x<2000000 => x*0.035
		case x if x>=2000000 => x*0.065
	}
}