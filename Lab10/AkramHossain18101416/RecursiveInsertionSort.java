public class RecursiveInsertionSort {
  public void recursiveInsertionSort (int []a,int i,int minLoc){
    if (i==a.length) return;
    findMinLoc(a,minLoc,i-1);
    recursiveInsertionSort(a,i+1,i+1);
  }
  public void findMinLoc(int[] a,int minLoc,int j) {
    if (j<0) return;
    if(a[minLoc]<a[j]) {
      swap(a,minLoc,j);
      minLoc=j;
    }
    else return;
    findMinLoc(a,minLoc,j-1);
  }
  public void swap(int[] a,int idx1,int idx2) {
    int temp=a[idx2];
    a[idx2]=a[idx1];
    a[idx1]=temp;
  }
  //-------------------------Insertion Sort shesh------------------ 
  public void printArray(int []a,int n){
    if (n==a.length) return;
    System.out.print(a[n]+"\t");
    printArray(a,n+1);
  }
}