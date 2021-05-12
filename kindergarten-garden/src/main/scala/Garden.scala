object Plant extends Enumeration {
  val Grass = Value("G")
  val Clover = Value("C")
  val Violets = Value("V")
  val Radishes = Value("R")
}

class Solver(positions: Map[Int, Array[Char]]) {

  val students = Array(
    "Alice",
    "Bob",
    "Charlie",
    "David",
    "Eve",
    "Fred",
    "Ginny",
    "Harriet",
    "Ileana",
    "Joseph",
    "Kincaid",
    "Larry"
  )

  def plants(input: String): Array[Plant.Value] =
    positions(students.indexOf(input)).map(v => Plant.withName(v.toString()))
}

object Garden {

  def splitBy2(x: String): List[String] = x match {
    case x if x.size == 2 => List(x)
    case x                => x.substring(0, 2) :: splitBy2(x.substring(2))
  }

  def defaultGarden(input: String): Solver = {

    val x = input
      .split('\n')
      .flatMap(x => splitBy2(x).zipWithIndex.map(_.swap))
      .groupBy(_._1)
      .map(x => (x._1, x._2.flatMap(y => y._2)))

    new Solver(x)

  }

}
