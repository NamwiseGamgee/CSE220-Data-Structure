public class FibonacciArray {
  int a[];
  public FibonacciArray(int n) {
    a=new int[n+1];
    for (int i=2;i<a.length;i++) {
      a[i]=-1;
    }
    a[0]=0;
    a[1]=1;
  }
  public int findFibonacci(int n) {
  if (a[n]>-1) return a[n];
  a[n]=findFibonacci(n-1)+findFibonacci(n-2);
  return a[n];
  }
}