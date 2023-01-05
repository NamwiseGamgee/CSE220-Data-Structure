import java.util.*;
public class Lab_01T1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean peyechi=false;
    System.out.println("Enter array length first: ");
    int a[]=new int[sc.nextInt()];
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    
    if (a[0]==6 || a[a.length-1]==6) {
      
      System.out.println("true");  
    }
    else {
      System.out.println("false");
    }
    
  }
}