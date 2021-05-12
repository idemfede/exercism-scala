object AllYourBase {

  def rebase(sourcBase: Int, list: List[Int], y: Int) = {

    def t(u: Int, b: Int): List[Int] = {
      u match {
        case x if x < b => List(x)
        case x          => List(x % b) ++ t(x / b, b)
      }
    }

    val decimalValue = (0 until list.size)
      .map(x => list.reverse(x) * Math.pow(sourcBase, x))
      .sum
      .toInt

    y match {
      case x if x <= 1 => None
      case _           => Some(t(decimalValue, y).reverse)
    }

  }

  //> res0: Double = 117.0

}
