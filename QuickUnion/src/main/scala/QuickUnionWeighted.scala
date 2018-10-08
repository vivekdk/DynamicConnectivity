// Weighted by height

class QuickUnionWeighted[T](list: List[ElementWeighted[T]]) extends DynamicConnectivity[T] {
  override def find(ele1: Int, ele2: Int): Boolean = {
    return root(list, ele1) == root(list, ele2)
  }

  override def union(ele1: Int, ele2: Int): Boolean = {
    val e1 = root(list, ele1)
    val e2 = root(list, ele2)
    if (heightOfTree(e1) > heightOfTree(e2)) {
      list(e2).parent = e1
      if (list(e1).height <= list(e2).height)
        list(e1).height = list(e1).height + 1
    }
    else {
      list(e1).parent = e2
      if (list(e2).height <= list(e1).height)
        list(e2).height = list(e2).height + 1
    }
    return true
  }

  private def heightOfTree(ele: Int): Int = {
    list(ele).height
  }
}
