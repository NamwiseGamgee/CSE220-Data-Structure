import java.util.*;
public class FibonacciTester {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  FibonacciArray f=new FibonacciArray(n);
  System.out.println("The "+n+"th Fibonacci number is "+f.findFibonacci(n));
  }
}