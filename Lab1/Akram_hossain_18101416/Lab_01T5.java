import java.util.*;
public class Lab_01T5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int a[]=new int[15];
    int b[]=new int[10];
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    for (int i=0;i<a.length;i++) {
      for (int j=0;j<b.length;j++) {
        if (a[i]==j) {
        ++b[j];
        break;
        }
        
      }
    }
    for (int i=0;i<b.length;i++) {
    System.out.println(i+ " was entered "+b[i]+ " times");
    }
  }
}