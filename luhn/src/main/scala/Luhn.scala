object Luhn {
  def valid(input: String) = {

    def validate(input: String) = {
      input.trim().size > 1 && input.matches("[0-9 ]+")
    }

    if (!validate(input)) false else

      input
        .map(x => x.asDigit)
        .filter(x => x > -1)
        .reverse
        .zip(1 to input.size)
        .map(x => if (x._2 % 2 == 0) x._1 * 2 else x._1)
        .map(x => if (x > 9) x - 9 else x)
        .sum % 10 == 0
  }             

}
