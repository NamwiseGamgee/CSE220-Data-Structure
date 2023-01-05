public class DoublyList{
  public Node head;
  public int count;
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public DoublyList(Object [] a){
    head = new Node(null, null, null);
    Node tail = head;
    
    for(int i = 0; i<a.length; i++){
      Node mn = new Node(a[i], null, null);
      count++;
      tail.next = mn;
      mn.prev=tail;
      tail=tail.next;
    }
    tail.next=head;
    head.prev=tail;
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public DoublyList(Node h){
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    
    return count; 
  }
  
  /* prints the elements in the list */
  public void forwardprint(){
    for (Node n=head.next;n!=head;n=n.next) {
      System.out.print(n.element+"\t");
    }
    System.out.println();
  }
  
  public void backwardprint(){
    for (Node n=head.prev;n!=head;n=n.prev) {
      System.out.print(n.element+"\t");
    }
    System.out.println(); 
  }
// returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int cnt=0;
    for (Node n=head.next;n!=head;n=n.next) {
      if (idx==cnt) {
        return n;
      }
      cnt++;
    }
    return null;
  }
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int cnt=0;
    for (Node n=head.next;n!=head;n=n.next) {
      if (n.element==elem) {
        return cnt;
      }
      cnt++;
    }
    return -1;
  }
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    int cnt=0;
    for (Node n=head.next;true;n=n.next) {
      if (cnt==idx) {
        if (idx<count) {
          Node newNode=new Node(elem,null,null);
          newNode.prev=n.prev;
          n.prev.next=newNode;
          newNode.next=n;
          n.prev=newNode;
          count++;
          break;
        }
        else {
          Node newNode=new Node(elem,null,null);
          head.prev.next=newNode;
          newNode.prev=head.prev;
          head.prev=newNode;
          newNode.next=head;
          count++;
          break;
        }
      }
      cnt++;
    }
  }
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    int cnt=0;
    if (index<0 || index>count-1) {
      return null;
    }
    else {
      for (Node n=head.next;;n=n.next) {
        if (cnt==index) {
          n.prev.next=n.next;
          n.next.prev=n.prev;
          return n.element;
        }
        cnt++;
      }
    }
  }
}