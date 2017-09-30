import org.scalatest._

class PalindromePermutationSpec extends FunSpec with Matchers {
  describe("PalindromePermutation") {
    describe("check") {
      describe("when string has no spaces") {
        it(s"verifies that ykaka's has a permutation that is a palindrome") {
          var string = "ykaka"
          var res = PalindromePermutation.check(string)
          res should be (true)
        }

        it(s"verifies that ykak's has no permutation that is a palindrome") {
          var string = "ykak"
          var res = PalindromePermutation.check(string)
          res should be (false)
        }
      }
      describe("when string has spaces") {
        it(s"verifies that 'Tact Coa' has a permutation that is a palindrome") {
          var string = "Tact Coa"
          var res = PalindromePermutation.check(string)
          res should be (true)
        }
        it(s"verifies that 'Tact Co' has a no permutations that are palindrome") {
          var string = "Tact Coa"
          var res = PalindromePermutation.check(string)
          res should be (true)
        }
      }
      describe("when string has 1 character") {
        it(s"verifies that the string has no permutations that are palindrome") {
          var string = "a"
          var res = PalindromePermutation.check(string)
          res should be (false)
        }
      }
      describe("when string has no characters") {
        it(s"verifies that the string has no permutations that are palindrome") {
          var string = ""
          var res = PalindromePermutation.check(string)
          res should be (false)
        }
      }
    }
  }
}
