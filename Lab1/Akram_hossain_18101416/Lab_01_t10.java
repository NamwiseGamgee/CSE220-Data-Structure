import java.util.*;
public class Lab_01_t10 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number between 1 to 12 : ");
    int month=sc.nextInt();
    System.out.println("Please enter a number between 1 to 31 : ");
    int date=sc.nextInt();
    if (month<=3) {
      if (month==3 && date>16) {
        System.out.println("Spring");
      }
      else System.out.println("Winter");
    }
    else if (month<=6) {
      if (month ==6 && date>16) {
        System.out.println("Summer");
      }
      else System.out.println("Spring");
    }
    else if (month<=9) {
      if (month==9 && date>16) {
        System.out.println("Fall");
      }
      else System.out.println("Summer");
    }
    else if (month<12) {
      System.out.println("Fall");
    }
    else {
      if (date<=15) {
        System.out.println("Fall");
      }
      else System.out.println("Winter");
    }
  }
}
      
      
      
    
    
      