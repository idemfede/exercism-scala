object SumOfMultiples {
  def sum(s: Set[Int], x: Int): Int = (1 until x).toList.filter(y => s.toList.exists(u => y % u == 0)) sum
}

