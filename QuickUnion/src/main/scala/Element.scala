trait Ele[T] {
  val ele:T
  var parent: Int
}

case class Element [T] (ele: T, var parent: Int) extends Ele[T]

case class ElementWeighted[T] (val ele: T, var parent: Int, var height : Int) extends Ele[T]
