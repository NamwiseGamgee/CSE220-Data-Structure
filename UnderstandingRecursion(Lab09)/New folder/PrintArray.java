import java.util.*;
public class PrintArray {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]={10,100,20,200,30,300,40,400};
    printArray(a,0);
  }
  public static void printArray(int []a,int index) {
  if (index==a.length) return;
  System.out.print(a[index]+"\t");
  printArray(a,index+1);
  }
}