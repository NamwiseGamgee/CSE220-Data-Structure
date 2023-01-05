public class TesterLinkedList {
  public static void main(String[] args) {
    int a[]={10,20,30,40,50};
    LinkedList l=new LinkedList(a);
    System.out.println("Summation is "+l.summation(l.head));
    l.printReverse(l.head);
    System.out.println();
  }
}