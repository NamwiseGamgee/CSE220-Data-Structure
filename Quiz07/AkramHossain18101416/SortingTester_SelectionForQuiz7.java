import java.util.Scanner;
public class SortingTester_SelectionForQuiz7 {
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    int a[]={5,-4,2,0,6,7,8,9,15,16,11};
    RecursiveSelectionSortForQuiz7 s=new RecursiveSelectionSortForQuiz7();
    System.out.println("How many intervals you want to devide the sorting in? For example, if you want to sort from index 0-3 and 8-11 "+"\n this means you'll divide the sorting in 2 intervals.Then enter 2");
    int division=sc.nextInt();
    for (int n=0;n<division;n++) {
      System.out.println("Enter lower index lim and then higher index limit");
      int i=sc.nextInt();
      int j=sc.nextInt();
      s.recursiveSelectionSort(a,i,j,a[i],i);
      s.printArray(a,0);
    }
  }
}