public class LinkedList {
  Node head;
  public LinkedList(int []a) {
    head=new Node(a[0],null);
    Node tail=head;
    for (int i=1;i<a.length;i++) {
      Node newNode=new Node(a[i],null);
      tail.next=newNode;
      tail=tail.next;
    }
  }
  
  //-----------------iterative bubble sort shuru---------------------
  public void sortListUsingLoop(Node h) {
    for (Node n=h;n.next!=null;n=n.next) {
      Node n1=h; //extra ekta variable nilam. Jate inner loop e n er man change hoye na jay.
      for (Node x=n1.next;x!=null;x=x.next,n1=n1.next) {
        if (n1.elem>x.elem) {
          int temp=n1.elem;
          n1.elem=x.elem;
          x.elem=temp;
        }
      }
    }
  }
  //--------------iterative bubble sort shesh------------------
  public void printList(Node h) {
    if (h==null) return;
    System.out.print(h.elem+"\t");
    printList(h.next);
  }
  
}