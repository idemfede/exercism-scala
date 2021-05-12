object Hamming {

  def distance(u: String, v: String): Option[Int] = try {
    Some((0 until u.size).toList
      .map(x => (v(x) -> u(x)))
      .foldRight(0)((x, acc) => if (x._1 == x._2) acc else 1 + acc))
  } catch {
    case e: Exception => None
  }   

}
