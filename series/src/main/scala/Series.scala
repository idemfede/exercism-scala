object Series{
    def slices(s:Int, u: String) = (for (x <- 0 to u.size - s) yield u.substring(x, x + s).map(c=>c.asDigit).toList).toList
}

 