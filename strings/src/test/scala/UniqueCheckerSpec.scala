import org.scalatest._

class UniqueCheckerSpec extends FunSpec with Matchers {
  describe("UniqueChecker") {
    describe("when letters are unique") {
      val letters = "abcdefghijk"
      val result = UniqueChecker.check(letters)
      it("returns true") {
        result should be (true)
      }
    }
    describe("when letters are not unique") {
      val letters = "aaabcdf"
      val result = UniqueChecker.check(letters)
      it("returns false") {
        result should be (false)
      }
    }

    describe("when string is empty") {
      val letters = ""
      val result = UniqueChecker.check(letters)
      it("returns true") {
        result should be (true)
      }
    }
  }
}
