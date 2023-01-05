import java.util.*;
public class BinarySearchRecursive {
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    int []a={10,20,18,41,52,52,54,67,68,93,100};
    System.out.println(binarySearch(a,0,a.length-1,false,sc.nextInt()));
  }
  public static boolean binarySearch(int[] a,int leftLim,int rightLim,boolean flag,int value) {
  int mid=(leftLim+rightLim)/2;
  if (leftLim>rightLim) return flag;
  if (a[mid]==value) return true;
  else if(a[mid]>value) rightLim=mid-1;
  else leftLim=mid+1;
  return binarySearch(a,leftLim,rightLim,flag,value);
  }
}