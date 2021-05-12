object PerfectNumbers{

  def classify(a: Int) = (1 until a).toList.filter(x => a % x == 0).sum match   {
  	case (x:Int) if x < a => NumberType.Deficient
  	case (x:Int) if x > a => NumberType.Abundant
  	case (x:Int) if x == a => NumberType.Perfect
  }
  
}

object NumberType extends Enumeration {
  val Perfect, Abundant, Deficient= Value
}