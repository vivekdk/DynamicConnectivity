// Weighted by height with path compression

class QuickUnionWeightedWithPathCompression[T](list: List[ElementWeighted[T]]) extends QuickUnionWeighted[T](list) {

  override def root(list: List[Ele[T]], ele: Int): Int = {
    val root = super.root(list, ele)
    compressPath(ele, root)
    root
  }

  private def compressPath(ele: Int, root: Int): Unit = {
    if (list(ele).parent == ele)
      return
    else {
      val parent = list(ele).parent
      list(ele).parent = root
      compressPath(parent, root)
    }
  }
}
