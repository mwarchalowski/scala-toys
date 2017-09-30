object StringCompression {
  def compress : String => String = {
    case "" => ""
    case string => {
      var _tuples = tuples(string)
      var res = _tuples.foldLeft(new StringBuilder()) {
        case (acc, (character, occurences)) =>  {
          acc.append(s"$character$occurences")
        }
      }.toString
      if (res.length < string.length)
        res
      else
        string
    }
  }

  def tuples(string: String) = {
    string.foldLeft(List[(Char, Int)]()) { (acc, character: Char) =>
      acc.headOption match {
        case Some((char, occurences)) if char == character => {
          (char -> (occurences + 1)) :: acc.tail
        }
        case _ => {
          (character -> 1) :: acc
        }
      }
    }.reverse
  }
}
