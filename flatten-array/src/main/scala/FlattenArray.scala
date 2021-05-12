object FlattenArray {

    def flatten(u: List[Any]): List[Any] = {

        u match {
                case Nil                  => Nil
                case (x: List[Any]) :: xs => { flatten(x) ::: flatten(xs) }
                case x :: xs              => { x :: flatten(xs) }
                }

    }      

}

