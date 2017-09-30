import org.scalatest._

class OneAwaySpec extends FunSpec with Matchers {
  describe("check") {
    describe("when strings are euqal length") {
      describe("when strings are one change away") {
        var stringA = "tesring"
        var stringB = "testing"
        it("verifies that strings are at most one change away") {
          var res = OneAway.check(stringA, stringB)
          res should be (true)
        }
      }
      describe("when strings are more than one change away") {
        var stringA = "pesring"
        var stringB = "testing"
        it("verifies that strings are at most one change away") {
          var res = OneAway.check(stringA, stringB)
          res should be (false)
        }
      }
      describe("when strings are the same") {
        var stringA = "testing"
        var stringB = "testing"
        it("verifies that strings are at most one change away") {
          var res = OneAway.check(stringA, stringB)
          res should be (true)
        }
      }
    }
    describe("when strings length is different by 1") {
      describe("when first string is longer") {
        var stringA = "testing"
        describe("when strings have no other swapped characters") {
          var stringB = "testin"
          it("verifies that strings are no more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (true)
          }
        }
        describe("when strings have no other swapped characters and difference is in the middle") {
          var stringB = "teting"
          it("verifies that strings are no more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (true)
          }
        }
        describe("when strings have no other swapped characters and difference is in the front") {
          var stringB = "esting"
          it("verifies that strings are no more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (true)
          }
        }
        describe("when strings have other swapped characters") {
          var stringB = "restin"
          it("verifies that strings are more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (false)
          }
        }
        describe("when strings have other swapped characters and the difference is up front") {
          var stringB = "erting"
          it("verifies that strings are more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (false)
          }
        }
        describe("when strings have other swapped characters and the difference is in the middle") {
          var stringB = "resing"
          it("verifies that strings are more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (false)
          }
        }
      }
      describe("when second string is longer") {
        var stringB = "testing"
        describe("when strings have no other swapped characters") {
          var stringA = "testin"
          it("verifies that strings are no more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (true)
          }
        }
        describe("when strings have no other swapped characters and difference is in the middle") {
          var stringA = "teting"
          it("verifies that strings are no more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (true)
          }
        }
        describe("when strings have no other swapped characters and difference is in the front") {
          var stringA = "esting"
          it("verifies that strings are no more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (true)
          }
        }
        describe("when strings have other swapped characters") {
          var stringA = "restin"
          it("verifies that strings are more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (false)
          }
        }
        describe("when strings have other swapped characters and the difference is up front") {
          var stringA = "erting"
          it("verifies that strings are more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (false)
          }
        }
        describe("when strings have other swapped characters and the difference is in the middle") {
          var stringA = "resing"
          it("verifies that strings are more than one change away") {
            var res = OneAway.check(stringA, stringB)
            res should be (false)
          }
        }
      }
    }
    describe("when strings length is different by more than 1") {
      var stringA = "testing"
      var stringB = "test"
      it("verifies that strings are more than 1 change away") {
        var res = OneAway.check(stringA, stringB)
        res should be (false)
      }
    }
  }
}
