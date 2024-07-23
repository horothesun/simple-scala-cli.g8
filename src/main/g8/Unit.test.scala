$if(use_scala_3.truthy)$
import UnitSuite.*
import munit.ScalaCheckSuite
import org.scalacheck.Gen
import org.scalacheck.Prop.forAll

class UnitSuite extends ScalaCheckSuite:

  test("1+1 is 2") {
    assertEquals(1 + 1, 2)
  }

  property("lists always have >= 0 elements") {
    forAll(listGen(Gen.alphaChar))(cs => assert(cs.length >= 0))
  }

object UnitSuite:

  def listGen[A](aGen: Gen[A]): Gen[List[A]] = Gen.listOf(aGen)
$else$
import UnitSuite._
import munit.ScalaCheckSuite
import org.scalacheck.Gen
import org.scalacheck.Prop.forAll

class UnitSuite extends ScalaCheckSuite {

  test("1+1 is 2") {
    assertEquals(1 + 1, 2)
  }

  property("lists always have >= 0 elements") {
    forAll(listGen(Gen.alphaChar))(cs => assert(cs.length >= 0))
  }

}

object UnitSuite {

  def listGen[A](aGen: Gen[A]): Gen[List[A]] = Gen.listOf(aGen)

}
$endif$
