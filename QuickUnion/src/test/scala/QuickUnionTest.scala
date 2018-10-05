import org.scalatest.FunSuite

class QuickUnionTest extends FunSuite {

  val list = Range(0, 10).map(e => Element(e, e)).toList
  val quickUnion = new QuickUnion(list)

  test("testUnion") {
    val result1 = quickUnion.union(0, 2)
    assert(result1 == true)
    val result2 = quickUnion.union(0, 4)
    assert(result2 == true)
  }

  test("testFind") {
    assert(quickUnion.find(4, 0) == true)
    assert(quickUnion.find(8, 1) == false)
  }

}
