package com.main.demo.patternmatching

sealed abstract class Tree
case class Node(elem: Int, left: Tree, right: Tree) extends Tree
case object Leaf extends Tree

//Return the in-order traversal sequence of a given tree.
/*def inOrder(t: Tree): List[Int] = t match{
  case Node(e, l, r) => inOrder(l) ::: List(e) ::: inOrder(r)
  case Leaf => List()
}*/

  