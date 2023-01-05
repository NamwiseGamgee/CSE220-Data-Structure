import java.util.*;
public class Tester {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[3];
    int b[]=new int[3];
    for (int i=0;i<a.length;i++) {
      System.out.println("Enter the "+i+"th element of 1st array");
      a[i]=sc.nextInt();
    }
    for (int i=0;i<a.length;i++) {
      System.out.println("Enter the"+i+" th element of 2nd array");
      b[i]=sc.nextInt();
    }
    Linkedlist list1=new Linkedlist(a);
    Linkedlist list2=new Linkedlist(b);
    list1.add(list2);
  }
}