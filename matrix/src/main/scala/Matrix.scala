class Matrix(x:String){

    def row(x: Integer)= x.split("\n")(row).split(" ").toVector

    def column(x: Integer)=x.split("\n").foldLeft(List[String]())((u, v) => u :+ v.split(" ")(row))

}

 