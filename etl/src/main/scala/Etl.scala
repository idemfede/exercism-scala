object Etl {

    def transform(a: Map[Int, Seq[String]]): Map[String, Int] = a.flatMap(x => x._2.map(u => (u.toLowerCase(), x._1))) 
}