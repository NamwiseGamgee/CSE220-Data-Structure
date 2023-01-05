import java.util.*;
public class Lab_Type01_task6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean result=true;
    System.out.println("Insert array size: ");
    int a[]=new int[sc.nextInt()];
    for (int i=0;i<a.length;i++) {
      System.out.println("Enter index no "+i+" :");
      a[i]=sc.nextInt();
    }
    for (int i=0,j=a.length-1;i<=j;i++,j--) {
      if (a[i]==a[j]) {
      }
      else {
        result=false;
        break;
      }
    }
    if (result) {
    System.out.println("This is a Palindrome Array.");
    }
    else System.out.println("This is not a Palindrome Array.");
  }
}
                         
                      
      