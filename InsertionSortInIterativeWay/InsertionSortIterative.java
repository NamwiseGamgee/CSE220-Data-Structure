public class InsertionSortIterative {
  public static void main(String []args) {
    int a[]={10,0,-1,-20,-5,40,100,5};
    sort(a);
    printArray(a);
  }
  public static void sort(int[] a) {
    for (int i=1;i<a.length;i++) {
      int min=a[i];
      int minLoc=i;
      for (int j=i-1;j>=0;j--) {
        if (min<a[j]) {
          a[minLoc]=a[j];
          a[j]=min;
          minLoc=j;
        }
        else break;
      }
    }
  }
  public static void printArray(int []a) {
    for (int i=0;i<a.length;i++) {
      System.out.print(a[i]+"\t");
    }
    System.out.println();
  }
}