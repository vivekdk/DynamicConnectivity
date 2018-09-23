package com.vdk.dynamicconnectivity.quickfind

class QuickFind[T] (val elementList : List[Element[T]]) {

  def union(x: Int, y: Int) = {
    elementList(y).cluster = elementList(x).cluster
    elementList
      .filter(_.cluster == elementList(y).cluster)
      .foreach(_.cluster = elementList(x).cluster)
  }

  def isConnected(x: Int, y: Int): Boolean = {
    elementList(y).cluster == elementList(x).cluster
  }

  override def toString: String = elementList.toString()
}
