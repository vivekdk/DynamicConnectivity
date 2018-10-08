trait DynamicConnectivity[T] {
  def find(ele1: Int, ele2: Int): Boolean

  def union(ele1: Int, ele2: Int): Boolean

  def root(list: List[Ele[T]], ele: Int): Int = {
    if (list(ele).parent == ele)
      return ele
    root(list, list(ele).parent)
  }
}
