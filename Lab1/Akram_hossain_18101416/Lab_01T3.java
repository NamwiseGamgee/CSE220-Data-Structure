import java.util.*;
public class Lab_01T3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean peyechi=false;
    //System.out.println("Enter array length first: ");
    int a[]=new int[5];
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    for (int i=0;i<a.length-1;i++) {
      int min=a[i];
      int minLoc=i;
      int temp;
      for (int j=i+1;j<a.length;j++) {
        if (a[j]<min) {
          minLoc=j;
          min=a[j];
           
        }
      }
      
      temp=a[i];
      a[i]=min;
      a[minLoc]=temp;
    }
  
    for (int i=0;i<a.length;i++) {
      System.out.println(a[i]);
   }
    for (int i=0;i<a.length;i++) {
      if (a[i]%2==0) {
        System.out.println(a[i]);
      }
    }
    
  }
}
