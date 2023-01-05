public class Tester_Lab10_Task04 {
  public static void main(String[] args) {
    int a[]={2,30,18,17,28,87,99};
    LinkedList_Task_04 l=new LinkedList_Task_04(a);
    l.selectionSortList(l.head);
    l.printList(l.head);
  }
}