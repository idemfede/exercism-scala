object PhoneNumber {

    def clean(x: String)=x.filter(x => x.isDigit).foldRight[String]("")((acc, x) => if (x.length() < 10) x + acc else x).reverse

}