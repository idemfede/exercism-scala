object Allergies {

  object Allergen extends Enumeration {
    type Allergen = Value
    val Eggs, Peanuts, Shellfish, Strawberries, Tomatoes, Chocolate, Pollen, Cats = Value

  }

  def list(x: Int) = x.toBinaryString.take(8).toCharArray().zip(Allergen.values).filter(x => x._1 == '1').map(x => x._2).toList

  def allergicTo(al: Allergen, x: Int): Boolean = list(x).contains(al)

}