public class LinkedList {
  Node head;
  public LinkedList (int []a) {
    Node tail;
    head=new Node(a[0],null);
    tail=head;
    for (int i=1;i<a.length;i++) {
      Node newNode=new Node(a[i],null);
      tail.next=newNode;
      tail=newNode;
    }
  }
  public int summation (Node h) {
  if (h.next==null) return h.elem;
  return h.elem+summation(h.next);
  }
  public void printReverse(Node n) {
  if (n==null) return;
  printReverse(n.next);
  System.out.print(n.elem+"\t");
  }
}