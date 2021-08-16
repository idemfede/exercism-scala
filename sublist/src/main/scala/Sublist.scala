object Sublist extends Enumeration {

  val Sublist, Superlist, Equal, Unequal = Value

  def test(x: List[Int], y: List[Int]): Boolean = {
 
    x match {
      case Nil                      => true
      case _ if x.length > y.length => false
      case _ => if (x.head != y.head) {
        test(x, y.tail)
      } else {
        val size = coincidenceSize(x, y)

        if (size == x.size) { true } else { test(x, y.tail) }

      }
    }

  }                                               

  def coincidenceSize(x: List[Int], y: List[Int]): Integer = {

    x.zip(y).filter(u => u._1 == u._2).size

  } 

  def sublist(x: List[Int], y: List[Int]): Value = {
    (test(x, y), test(y, x)) match {
      case (true, true)   => Equal
      case (true, false)  => Sublist
      case (false, true)  => Superlist
      case (false, false) => Unequal
    }

  }

}
