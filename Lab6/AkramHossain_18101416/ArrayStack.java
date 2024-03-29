public class ArrayStack implements Stack{
  int size;
  Object [] data;
  
  public ArrayStack(){
    size=0;
    data = new Object[5];
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
    }
    else flag=false;
    return flag;
  }
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
  public void push(Object e) throws StackOverflowException{
    if (size<data.length) data[size++]=e;
    else {
      StackOverflowException ex=new StackOverflowException();
      throw ex;
    }
  }
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
  public Object pop() throws StackUnderflowException{
    Object eitaPaichi;
    if (size<=0) {
      StackUnderflowException ex=new StackUnderflowException();
      throw ex;
    }
    else {
      eitaPaichi=data[size-1];
      data[size-1]=null;
      size--;
    }
    return eitaPaichi;
  }
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
  public Object peek() throws StackUnderflowException{
    if (size==0) {
      StackUnderflowException ex=new StackUnderflowException();
      throw ex;
    }
    return data[size-1];
  }
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
  public String toString(){
    String st="";
    for (int i=0;i<size;i++) {
      st+=data[i]+" ";
    }
    return "[ "+st+"]";
  }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
  public Object[] toArray(){
    Object[] array=new Object[size];
    for (int i=0,j=size-1;j>=0;i++,j--) {
      array[i]=data[j];
    }
    return array;
  }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
  public int search(Object e){
    int cnt=0;
    for (int i=size-1;i>=0;i--) {
      if (data[i]==e) {
        return cnt;
      }
      cnt++;
    }
    return -1 ;
  }
}