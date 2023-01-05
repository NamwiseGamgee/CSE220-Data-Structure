import java.util.*;
public class Lab1_Type01_task8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the number of coulmns you want- ");
    int n=sc.nextInt();
    int a[][]=new int[1][n];
    int b[][]=new int[1][n];
    for (int i=0;i<a.length;i++) {
      for (int j=0;j<a[0].length;j++) {
        System.out.println("Please enter entry "+i+" "+j+" for the 1st matrix : ");
        a[i][j]=sc.nextInt();
      }
    }
    for (int i=0;i<b.length;i++) {
      for (int j=0;j<b[0].length;j++) {
        System.out.println("Please enter entry "+i+" "+j+" for the 2nd matrix : ");
        b[i][j]=sc.nextInt();
      }
    }
    for (int i=0;i<a.length;i++) {
      for (int j=0;j<a[0].length;j++) {
        a[i][j]=a[i][j]*5-b[i][j];
        System.out.print(a[i][j]+"\t");
      }
    }
    
  }
}