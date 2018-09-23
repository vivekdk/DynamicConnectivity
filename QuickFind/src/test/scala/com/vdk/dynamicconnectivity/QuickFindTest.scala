package com.vdk.dynamicconnectivity.quickfind

import org.scalatest.FunSuite

class QuickFindTest extends FunSuite {

  val elements: List[Element[Object]] = (0 to 5)
    .map(i => Element(i, new Object))
    .toList

  val quickFind: QuickFind[Object] = new QuickFind(elements)
  quickFind.union(1, 2)
  quickFind.union(1, 3)
  quickFind.union(4, 5)

  test("testIsConnected") {
    assert(quickFind.isConnected(2, 3) == true)
    assert(quickFind.isConnected(4, 5) == true)
    assert(quickFind.isConnected(1, 5) == false)
    assert (quickFind.isConnected(0,4) == false)
  }

  test("testUnion") {
    assert(elements(1).cluster == 1)
    assert(elements(2).cluster == 1)
    assert(elements(3).cluster == 1)
    assert(elements(4).cluster == 4)
    assert(elements(5).cluster == 4)
  }

}
