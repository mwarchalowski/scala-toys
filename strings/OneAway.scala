object OneAway {
  def check : (String, String) => Boolean = {
    case (a, b) if Math.abs(a.length - b.length) > 1 => false
    case (a, b) if a.length == b.length => checkSameLength(a,b)
    case (a, b) if a.length - b.length == 1 => checkOneDiff(a,b)
    case (a, b) if b.length - a.length == 1 => checkOneDiff(b,a)
    case _ => false
  }

  def checkOneDiff(a: String, b: String) : Boolean = {
    var bCursor = 0
    var difference = false
    for(i <- 0 until a.length if bCursor < b.length) {
      if(a(i) != b(bCursor)) {
        if (difference) return false
        difference = true
      } else {
        bCursor += 1
      }
    }
    true
  }

  def checkSameLength(a: String, b: String) : Boolean = {
    var difference = false
    for(i <- 0 until a.length) {
      if(a(i) != b(i)) {
        if (difference == true) return false
        difference = true
      }
    }
    true
  }
}
