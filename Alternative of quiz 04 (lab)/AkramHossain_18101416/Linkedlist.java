public class Linkedlist {
  public Node head;
  public int count;
  public Linkedlist(int []a) {
    head=new Node(a[0],null);
    Node tail=head;
    count++;
    for (int i=1;i<a.length;i++) {
      Node n=new Node(a[i],null);
      count++;
      tail.next=n;
      tail=n;
      
    }
  }
  public void add(Linkedlist list2) {
    Node headOfList2=list2.head;
    String a=Integer.toString(head.elem);
    String b=Integer.toString(headOfList2.elem);
    for (Node n1=head.next,n2=headOfList2.next;n1!=null;n1=n1.next,n2=n2.next) {
      a=a.concat(Integer.toString(n1.elem));
      b=b.concat(Integer.toString(n2.elem));
    }
    int sum=Integer.parseInt(a)+Integer.parseInt(b);
   
   String c=Integer.toString(sum);
    
    char[] array=c.toCharArray();
    Node newHead=new Node(((int)array[0]-48),null);
    Node newtail=newHead;
    for (int i=1;i<array.length;i++) {
      Node n=new Node(((int)array[i]-48),null);
      count++;
      newtail.next=n;
      newtail=n;
      
    }
    for (Node n=newHead;n!=null;n=n.next) {
      System.out.print(n.elem);
    }

  }
}

