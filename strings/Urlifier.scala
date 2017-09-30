object Urlifier {
  def urlify(string: String, len: Int) = {
    var replacement = string.toArray
    var last_position = string.length - 1
    var reversed = "02%"

    for (i <- ((len - 1) to 0 by -1)) {
      if (replacement(i) == ' ') {
        for(c <- reversed) {
          replacement(last_position) = c
          last_position = last_position - 1
        }
      } else {
        replacement(last_position) = replacement(i)
        last_position = last_position - 1
      }
    }
    replacement.mkString
  }
}
