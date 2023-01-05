public class Stack {
  int size;
  Object c[];
  public Stack(String s) {
    c=new Object[s.length()];
  }
  public void push(Object a) {
    if (size==c.length) {
      System.out.println("Stack is full");
      return;
    }
    else {
      c[size++]=a;
    }
  }
  public boolean isEmpty() {
    boolean decision=false;
    if (size==0) {
      decision=true;
    }
    return decision;
  }
  public Object peek() {
    if (size==0) return null;
    else {
      return c[size-1];
    }
  }
  public Object pop() {
    int temp=--size;
    return c[temp];
  }
  
}