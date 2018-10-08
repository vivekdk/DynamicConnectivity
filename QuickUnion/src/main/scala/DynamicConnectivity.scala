trait DynamicConnectivity[T] {
  def find(ele1: Int, ele2: Int): Boolean

  def union(ele1: Int, ele2: Int): Boolean

  def findParent(list: List[Ele[T]], ele: Int): Int = {
    if (list(ele).parent == ele)
      return ele
    findParent(list, list(ele).parent)
  }
}
