import scala.collection.mutable

object PermutationChecker {
  def check(string: String, other: String) : Boolean = {
    if (string.length != other.length) return false
    val characters = string.foldLeft(mutable.Map[Char, Int]()) { (acc, c: Char) =>
      acc += (c -> (acc.getOrElse(c, 0) + 1))
    }
    !other.foldLeft(characters) { (acc, c: Char) =>
      acc += (c -> (acc.getOrElse(c, 0) - 1))
    }.values.exists { _ < 0}
  }
}
