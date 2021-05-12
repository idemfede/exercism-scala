object Pangrams {
  def isPangram(input: String): Boolean = ('a' until 'z').toList.forall(x=>input.contains(x))
}

