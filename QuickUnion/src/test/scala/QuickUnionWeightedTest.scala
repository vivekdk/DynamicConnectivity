import org.scalatest.FunSuite

class QuickUnionWeightedTest extends FunSuite {

  val list = Range(0, 10).map(e => ElementWeighted(e, e, 1)).toList
  val quickUnionWeighted = new QuickUnionWeighted(list)


  test("testUnion") {
    quickUnionWeighted.union(0, 2)
    quickUnionWeighted.union(2, 3)
    quickUnionWeighted.union(4, 0)
    quickUnionWeighted.union(6, 7)
    quickUnionWeighted.union(6, 2)

  }

  test("testFind") {
    assert(quickUnionWeighted.find(0, 3) == true)
    assert(quickUnionWeighted.find(3, 4) == true)
    assert(quickUnionWeighted.find(7, 2) == true)
  }

  test("testFindParent") {
    assert(quickUnionWeighted.root(list, 3) == 2)
    assert(quickUnionWeighted.root(list, 4) == 2)
    assert(quickUnionWeighted.root(list, 7) == 2)
    assert(quickUnionWeighted.root(list, 6) == 2)
  }

}
