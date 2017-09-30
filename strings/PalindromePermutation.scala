import scala.collection.mutable

object PalindromePermutation {
  def check : String => Boolean = {
    case string if string.length > 1  => {
      string.foldLeft(mutable.Map[Char, Int]()) {
        case (acc, ' ') => acc
        case (acc, c) if acc.contains(c.toLower) =>  acc -= c.toLower
        case (acc, c) =>  acc += (c.toLower -> 1)
      }.size <= 1
    }
    case _ => false
  }
}
