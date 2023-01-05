public class ListStack implements Stack{
  int size;
  Node top;
  
  
  public ListStack(){
    size = 0;
    top = null;
  }
  
// The number of items on the stack
  public int size(){
    return size;
  }
// Returns true if the stack is empty
  public boolean isEmpty(){
    boolean flag=false;
    if (size==0) {
      flag=true;
      return flag;
    }
    else return false;
  }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
  public void push(Object e) throws StackOverflowException{
    
    if (top==null) {
      top=new Node(e,null);
      size++;
    }
    else {
      Node n=new Node(e,null);
      n.next=top;
      top=n;
      size++;
    }
  }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
  public Object pop() throws StackUnderflowException{
    Object element;
    if (top==null) {
      StackUnderflowException ex=new StackUnderflowException();
      throw ex;
    }
    else {
      element=top.val;
      Node temp;
      temp=top;
      top=top.next;
      temp=null;
      size--;
      return element;
    }
  }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
  public Object peek() throws StackUnderflowException{
    if (top==null) {
      StackUnderflowException ex=new StackUnderflowException();
      throw ex;
    }
    else {
      return top.val;
    }
    
  }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
  public String toString(){
    String st="";
    for (Node n=top;n!=null;n=n.next) {
      st+=n.val+" ";
    }
    return "[ "+st+"]";
  }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
  public Object[] toArray(){
    Node n=top;
    Object a[]=new Object[size];
    for (int i=0;n!=null;n=n.next,i++) {
      a[i]=n.val;
    }
    return a;
  }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
  public int search(Object e){
    int cnt=0;
    for (Node n=top;n!=null;n=n.next) {
      if (e==n.val) {
        return cnt;
      }
      cnt++;
    }
    return -1;
  }
}