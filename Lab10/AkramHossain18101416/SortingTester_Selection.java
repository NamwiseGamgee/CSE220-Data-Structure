public class SortingTester_Selection {
  public static void main(String []args) {
    int a[]={10,0,20,1,-5,40,100,5};
    RecursiveSelectionSort s=new RecursiveSelectionSort();
    s.recursiveSelectionSort(a,0,a[0],0);
    s.printArray(a,0);
  }
}