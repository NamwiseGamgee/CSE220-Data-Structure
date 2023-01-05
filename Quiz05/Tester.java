import java.util.*;
public class Tester {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack operator = new Stack(s);
    Stack operatorPos = new Stack(s);
    boolean haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=true;
    for (int i=0;i<s.length();i++) {
      if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
        operator.push(s.charAt(i));
        operatorPos.push(i+1);
      }
      //----------First bracket er jonno likhi----------------
      else if (s.charAt(i)==')') {
        if (operator.isEmpty()) {
          System.out.println("This expression is not correct");
          System.out.println("Error at character #"+(int)(i+1)+".`"+s.charAt(i)+"`-not opened");
          haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=false;
          break;
        }
        else if((char)operator.peek()=='(') {
          operator.pop();
          operatorPos.pop();
        }
        else {
          System.out.println("This expression is not correct");
          System.out.println("Error at character #"+operatorPos.peek()+".`"+operator.peek()+"`-not closed");
          haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=false;
          break;
        }
      }
      //---------2nd bracket er jonno likhi-------------------
      else if (s.charAt(i)=='}') {
        if (operator.isEmpty()) {
          System.out.println("This expression is not correct");
          System.out.println("Error at character #"+(int)(i+1)+".`"+s.charAt(i)+"`-not opened");
          haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=false;
          break;
        }
        else if((char)operator.peek()=='{') {
          operator.pop();
          operatorPos.pop();
        }
        else {
          System.out.println("This expression is not correct");
          System.out.println("Error at character #"+operatorPos.peek()+".`"+operator.peek()+"`-not closed");
          haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=false;
          break;
        }
      }
      //---------3rd bracket er jonne likhi-------------------
      else if (s.charAt(i)==']') {
        if (operator.isEmpty()) {
          System.out.println("This expression is not correct");
          System.out.println("Error at character #"+(int)(i+1)+".`"+s.charAt(i)+"`-not opened");
          haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=false;
          break;
        }
        else if((char)operator.peek()=='[') {
          operator.pop();
          operatorPos.pop();
        }
        else {
          System.out.println("This expression is not correct");
          System.out.println("Error at character #"+operatorPos.peek()+".`"+operator.peek()+"`-not closed");
          haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche=false;
          break;
        }
      }
    }
//-------------------------------Loop shesh------------------------
    if (operator.isEmpty() && haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche) {
      System.out.println("This expression is correct. Take love Nigga! <3");
    }
    else if(!operator.isEmpty() && haaVaiKonoGondogolPainaiLoopThikthakSheshHoiche) {
      System.out.println("This expression is not correct");
      System.out.println("Error at character #"+operatorPos.peek()+".`"+operator.peek()+"`-not closed");
    }
  }
}