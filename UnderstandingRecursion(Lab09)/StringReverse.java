import java.util.*;
public class StringReverse {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char[] c=s.toCharArray();
    s=(reverse(s,0,""));
    System.out.println(s);
  }
  public static String reverse(String s,int i,String a) {
  if (i==s.length()-1) return s.charAt(i)+"";
  return a=a+reverse(s,i+1,a)+s.charAt(i);
  }
}