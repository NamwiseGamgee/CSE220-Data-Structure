import java.util.*;
public class Lab_01T3P2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    try {
      int x,n=sc.nextInt();
      int a[]=new int[n];
      a[5]=99;
      x=n/0;
    }
    catch (ArithmeticException e) {
    System.out.println(" Dekh, ei vul korchos- "+e);
    }
    catch (ArrayIndexOutOfBoundsException e) {
    System.out.println(" Dekh, ei vul korchos- "+e);
    }
    finally {
    System.out.println(" THE END ");
    }
    }
}
