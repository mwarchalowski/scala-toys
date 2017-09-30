import org.scalatest._

class UrlifierSpec extends FunSpec with Matchers {
  describe("Urlifier") {
    describe("when string with spaces is given") {
      val string = "this is a test      "
      val result = Urlifier.urlify(string, 14)
      it("urlifies string correctly") {
        result should be ("this%20is%20a%20test")
      }
    }
    describe("when string is all spaces") {
      val string = "         "
      val result = Urlifier.urlify(string, 3)
      it("urlifies string correctly") {
        result should be ("%20%20%20")
      }
    }
    describe("when string has space up front") {
      val string = " testing space    "
      val result = Urlifier.urlify(string, 14)
      it("urlifies string correctly") {
        result should be ("%20testing%20space")
      }
    }
    describe("when string has space at the end") {
      val string = "testing space     "
      val result = Urlifier.urlify(string, 14)
      it("urlifies string correctly") {
        result should be ("testing%20space%20")
      }
    }
  }
}
