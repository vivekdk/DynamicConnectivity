import org.scalatest.FunSuite

class quickUnionWeightedWithPathCompressionWithPathCompressionTest extends FunSuite {

  val list = Range(0, 10).map(e => ElementWeighted(e, e, 1)).toList
  val quickUnionWeightedWithPathCompression = new QuickUnionWeightedWithPathCompression(list)


  test("testUnion") {
    quickUnionWeightedWithPathCompression.union(0, 2)
    quickUnionWeightedWithPathCompression.union(2, 3)
    quickUnionWeightedWithPathCompression.union(4, 0)
    quickUnionWeightedWithPathCompression.union(6, 7)
    quickUnionWeightedWithPathCompression.union(6, 2)

  }

  test("testFind") {
    assert(quickUnionWeightedWithPathCompression.find(0, 3) == true)
    assert(quickUnionWeightedWithPathCompression.find(3, 4) == true)
    assert(quickUnionWeightedWithPathCompression.find(7, 2) == true)
  }

  test("testFindParent") {
    assert(quickUnionWeightedWithPathCompression.root(list, 3) == 2)
    assert(quickUnionWeightedWithPathCompression.root(list, 4) == 2)
    assert(quickUnionWeightedWithPathCompression.root(list, 7) == 2)
    assert(quickUnionWeightedWithPathCompression.root(list, 6) == 2)
  }
}
