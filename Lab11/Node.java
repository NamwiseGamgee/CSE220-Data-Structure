class Node
{
  int element;
  Node left;
  Node right;
  Node parent;
  
  Node(int e,Node l,Node r,Node p)
  {
    element = e;
    left = l;
    right = r;
    parent = p;
  }
}