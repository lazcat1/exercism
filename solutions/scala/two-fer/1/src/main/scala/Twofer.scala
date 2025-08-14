object Twofer {
  def twofer(name: String=""): String = {
    val other: String = if (name == null || name.isEmpty) "you" else name
    s"One for $other, one for me."
  }
}
