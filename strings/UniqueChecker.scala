object UniqueChecker {
  def check(string: String) = {
    string.foldLeft(Map[Char,Int]()) { (m, key: Char) =>
      m.updated(key, m.getOrElse(key, 0) + 1)
    }.values.forall(_ <= 1)
  }
}
