import java.util.*;
public class Lab_01T2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    boolean peyechi=false;
    //System.out.println("Enter array length first: ");
    int a[]=new int[5];
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    int max,min;
    int maxLoc=0;
    int minLoc=0;
    max=a[0];
    min=a[0];
    for (int i=1;i<a.length;i++) {
      if (a[i]>max) {
        maxLoc=i;
        max=a[i];
      }
      else if (a[i]<min) {
        minLoc=i;
        min=a[i];
      }
    }
    a[maxLoc]=min;
    a[minLoc]=max;
    for (int i=0;i<a.length;i++) {
      System.out.println(a[i]);
    }
  }
}