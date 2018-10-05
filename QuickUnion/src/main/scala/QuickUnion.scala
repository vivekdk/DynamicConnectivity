class QuickUnion[T](list: List[Element[T]]) {

  def find(ele1: Int, ele2: Int): Boolean = {
    val parent1 = findParent(ele1)
    val parent2 = findParent(ele2)
    return parent1 == parent2
  }

  def union(ele1: Int, ele2: Int): Boolean = {
    val parent1 = findParent(ele1)
    val parent2 = findParent(ele2)
    list(parent1).parent = parent2
    return true
  }

  private def findParent(ele: Int): Int = {
    if (list(ele).parent == ele)
      return ele
    findParent(list(ele).parent)
  }
}
