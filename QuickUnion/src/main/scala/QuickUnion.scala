// Quick Union : without weighting

class QuickUnion[T](list: List[Element[T]]) extends DynamicConnectivity[T] {

  override def find(ele1: Int, ele2: Int): Boolean = {
    val parent1 = findParent(list, ele1)
    val parent2 = findParent(list, ele2)
    return parent1 == parent2
  }

  override def union(ele1: Int, ele2: Int): Boolean = {
    val parent1 = findParent(list, ele1)
    val parent2 = findParent(list, ele2)
    list(parent1).parent = parent2
    return true
  }

}
