object Leap {
  def devisible(a: Int, b:Int): Boolean = {
    if (a%b == 0) true else false
  }
  def leapYear(year: Int): Boolean = {
    if (devisible(year, 400) || (devisible(year, 4) && !devisible(year, 100))) true else false
  }
}
