public class Tester_Lab10_Task03 {
  public static void main(String[] args) {
    int a[]={2,30,18,17,28,87,99};
    LinkedList l=new LinkedList(a);
    l.sortListUsingLoop(l.head);
    l.printList(l.head);
  }
}