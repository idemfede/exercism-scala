object NthPrime {
  def numbersFrom(from: Int): Stream[Int] = from #:: numbersFrom(from + 1)
                                                  //> numbersFrom: (from: Int)Stream[Int]

  def sieve(input: Stream[Int]): Stream[Int] = input.head #:: sieve(input.tail.filter(x => x % input.head != 0))
                                                  //> sieve: (input: Stream[Int])Stream[Int]

  val primes = sieve(numbersFrom(2))              //> primes  : Stream[Int] = Stream(2, ?)

  def prime(x: Int) = {
    Some(primes(x - 1))
  } 

}
