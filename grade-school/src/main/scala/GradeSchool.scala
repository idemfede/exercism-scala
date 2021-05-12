class School {
  type DB = Map[Int, Seq[String]]

  val a: DB = Map[Int, Seq[String]]() 

  def add(name: String, g: Int) = db.updated(g, db.get(g).getOrElse(Seq[String](name)) :+ name)

  def db: DB = a                                  //> db: => Wk4.DB

  def grade(g: Int): Seq[String] = db.get(g).getOrElse(Seq[String]())
 
  def sorted: DB = (for { x <- db.keySet.toList.sorted } yield (x, db.get(x).get.toList.sorted)).toMap
 
}

 