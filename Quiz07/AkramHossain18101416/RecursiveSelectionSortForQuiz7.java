public class RecursiveSelectionSortForQuiz7 {
  public void recursiveSelectionSort (int []a,int lowerLim,int upperLim,int min,int minLoc){
  if (lowerLim==upperLim) return;
  minLoc=findMinLoc(minLoc,lowerLim+1,upperLim,a,min);
  swap(a,minLoc,lowerLim);
  recursiveSelectionSort(a,lowerLim+1,upperLim,a[lowerLim+1],lowerLim+1); 
  }
  public int findMinLoc(int minLoc,int start,int end,int []a,int min) {
  if (start==end+1) return minLoc;
  if(min>a[start]) {
    min=a[start];
    minLoc=start;
  }
  return findMinLoc(minLoc,start+1,end,a,min);
  }
  public void swap(int[] a,int idx1,int idx2) {
  int temp=a[idx2];
  a[idx2]=a[idx1];
  a[idx1]=temp;
  }
  //-------------------------selection Sort shesh------------------ 
  public void printArray(int []a,int n){
  if (n==a.length) return;
  System.out.print(a[n]+"\t");
  printArray(a,n+1);
  }
  
}