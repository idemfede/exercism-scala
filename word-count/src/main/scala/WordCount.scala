class WordCount(x:String) {
 
   def countWords = x.split(" ").groupBy(x=>x).map(x => x._1 -> x._2.size)

}