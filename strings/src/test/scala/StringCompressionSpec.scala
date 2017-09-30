import org.scalatest._

class StringCompressionSpec extends FunSpec with Matchers {
  describe("StringCompression") {
    describe("compress") {
      describe("when compressed version is shorter than uncompressed") {
        var string = "aabbbcccc"
        it("returns compressed version") {
          var res = StringCompression.compress(string)
          res should be ("a2b3c4")
        }
      }
      describe("when compressed version is longer than uncompressed") {
        var string = "abcd"
        it("returns original version version") {
          var res = StringCompression.compress(string)
          res should be ("abcd")
        }
      }
      describe("when compressed version is same as uncompressed version") {
        var string = "aabb"
        it("returns original version version") {
          var res = StringCompression.compress(string)
          res should be ("aabb")
        }
      }
      describe("when the string is empty") {
        var string = ""
        it("return an empty string") {
          var res = StringCompression.compress(string)
          res should be ("")
        }
      }
    }
  }
}
