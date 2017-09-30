import org.scalatest._

class PermutationCheckerSpec extends FunSpec with Matchers {
  describe("PermutationChecker") {
    var stringA = "abcd"
    describe("when two strings are permutations") {
      var stringB = "badc"
      val result = PermutationChecker.check(stringA,stringB)
      it("returns true") {
        result should be (true)
      }
    }
    describe("when strings are not permutations of each other") {
      var stringB = "wxyz"
      val result = PermutationChecker.check(stringA,stringB)
      it("returns false") {
        result should be (false)
      }
    }

    describe("when strings are of different length") {
      var stringB = "abc"
      val result = PermutationChecker.check(stringA, stringB)
      it("returns false") {
        result should be (false)
      }
    }
  }
}
