object RunLengthEncoding {

  def encode(input: String): String = {

    def t(input: List[Char]): String =
      input match {
        case Nil => ""
        case x :: xs if xs.takeWhile(y => y.equals(x)).size == 0 =>
          s"${x}" + t(xs.dropWhile(y => y.equals(x)))
        case x :: xs if xs.takeWhile(y => y.equals(x)).size != 0 =>
          s"${xs.takeWhile(y => y.equals(x)).size + 1}${x}" + t(
            xs.dropWhile(y => y.equals(x))
          )
      }

    t(input toList)
  }

  def decode(input: String): String = {

    def number(input: List[Char]): Int =
      input.takeWhile(u => u.isDigit).foldLeft("")((x, y) => s"${x}${y}").toInt

    def f(input: List[Char]) = input.dropWhile(y => y.isDigit)

    def d(input: List[Char]): String =
      input match {
        case Nil => ""
        case x :: xs if x.isDigit =>
          f(xs)(0).toString() * (number(x :: xs) - 1) + d(f(xs))
        case x :: xs if !x.isDigit => s"${x}" + d(xs)
      }

    d(input toList)
  }

}
