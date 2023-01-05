public class SortingTester_Insertion {
  public static void main(String []args) {
    int a[]={10,0,20,1,-5,40,100,5};
    RecursiveInsertionSort s=new RecursiveInsertionSort();
    s.recursiveInsertionSort(a,1,1);
    s.printArray(a,0);
  }
}