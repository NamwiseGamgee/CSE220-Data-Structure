import java.util.*;
public class DecimalToBinary {
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt(); 
    System.out.println("Binary of "+b+" is "+bin(b,""));
    System.out.println("End");
  }
  public static String bin(int b,String s){
    int rem;
    if (b==1) return b%2+"";
    s=s+(bin(b/2,""));
    rem=b%2;
    return s+rem;
  }
}