public class LinkedList{
  public Node head;
  public int count;
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
    head=new Node(a[0],null);
    count++;
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node x=new Node(a[i],null);
      count++;
      tail.next=x;
      tail=x;//tail=tail.next;
    }
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
    Node newHead=null;
    Node newTail=null;
    for (Node n=head;n!=null;n=n.next) {
      Node newNode=new Node(n.element,null);
      if (newHead==null) {
        newHead=newNode;
        newTail=newNode;
      }
      else {
        newTail.next=newNode;
        newTail=newNode;
      }
    }
    head=newHead;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    // TO DO
    return count; // please remove this line!
  }
  
  /* prints the elements in the list */
  public void printList(){
    for (Node n=head;n!=null;n=n.next) {
      System.out.print(n.element+"\t");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int cnt=0;
    if (idx<0 || idx>(count-1) ) {
      return null;
    }
    else {
      
      for (Node n=head;n!=null;n=n.next,cnt++) {
        if (cnt==idx) {
          return n;
        }
      }
    }
    return null;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    int cnt=0;
    if (idx<0 || idx >(count-1)) {
      return null;
    }
    for (Node n=head;n!=null;n=n.next) {
      if (cnt==idx) {
        return n.element;
      }
      cnt++;
    }
    return null; 
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    int cnt=0;
    Object earlyValue;
    if (idx<0 || idx >(count-1)) {
      return null;
    }
    else {
      for (Node n=head;n!=null;n=n.next) {
        if (cnt==idx) {
          earlyValue=n.element;
          n.element=elem;
          return earlyValue;
        }
        cnt++;
      }
    }
    return null; 
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int cnt=0;
    for (Node n=head;n!=null;n=n.next,cnt++) {
      if (n.element==elem) {
        return cnt;
      }
    }
    
    return -1; 
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    boolean ache=false;
    for (Node n=head; n!=null;n=n.next) {
      if (n.element==elem) {
        ache=true;
        break;
      }
    }
    return ache; 
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node newHead=null;
    Node newTail=null;
    for (Node n=head;n!=null;n=n.next) {
      Node newNode=new Node(n.element,null);
      if (newHead==null) {
        newHead=newNode;
        newTail=newNode;
      }
      else {
        newTail.next=newNode;
        newTail=newNode;
      }
    }
    return newHead;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node newHead=null; 
    
    for (Node n=head;n!=null;n=n.next) {
      Node p=new Node(n.element,null);
      p.next=newHead;
      newHead=p;
    }
    return newHead;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    
    int cnt=0;
    Node prevNode=head;
    for (Node n=head;cnt<=count;n=n.next) {
      
      if (idx==0) {
        Node newNode=new Node(elem,null);
        newNode.next=head;
        head=newNode;
        count++;
        break;
      }
      else if(cnt==idx) {
        Node newNode=new Node(elem,null);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
        count++;
        break;
      }
      
      cnt++;
      prevNode=n;
    }
    
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    int cnt=0;
    Object nodeElem;
    Node prevNode=head;
    for (Node n=head;cnt<=count;n=n.next) {
      
      if (index==0) {
        head=head.next;
        nodeElem=prevNode.element;
        n=null;
        count--;
        return nodeElem;
      }
      else if(cnt==index) {
        prevNode.next=n.next;
         nodeElem=n.element;
        n=null;
        count--;
        return nodeElem;
      }
      
      cnt++;
      prevNode=n;
    }
    
    return null; // please remove this line!
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    Node prevHead=head;
    Node newHead=head.next;
    for (Node n=head;n!=null;n=n.next) {
      if(n.next==null) {
      n.next=prevHead;
      prevHead.next=null;
      }
    }
    head=newHead;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    Node prevHead=head;
    Node prevNode=null;
    for (Node n=head;n!=null;n=n.next) {
      if (n.next==null){
      n.next=prevHead;
      prevNode.next=null;
      head=n;
      break;
      }
    prevNode=n;
    }
  }
  
}