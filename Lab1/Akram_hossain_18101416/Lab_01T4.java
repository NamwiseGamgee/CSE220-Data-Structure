import java.util.*;
public class Lab_01T4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    int a[]=new int[5];
    // a[0]=sc.nextInt();
    for (int i=0;i<a.length;i++) {
      System.out.println("Enter number for position "+i);
      a[i]=sc.nextInt();
      
      for (int j=0;j<i;j++) {
        if (a[i]==a[j]) {
          System.out.println(a[i]+" is already in among the entered numbers.Enter a diff num: ");
          i--;
          break;
        }
      }
      
    }
  }
}

      