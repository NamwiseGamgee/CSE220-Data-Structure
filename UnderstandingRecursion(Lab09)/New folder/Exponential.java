import java.util.*;
public class Exponential {
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(exp(m,n));
    System.out.println("End");
  }
  public static int exp(int m,int n){
    int temp;
    if (n==0) return 1;
    if (n%2==0) {
      temp=exp(m,n/2);
      return temp*temp;
    }
    else {
      temp=exp(m,n/2);
      return temp*temp*m;
    }
  }
}