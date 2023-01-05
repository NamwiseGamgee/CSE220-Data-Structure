public class RecursionExperimental_v {
    public static void main(String [] args){
      int a[]={10,20,30,10,5};  
      System.out.println(A(a,1,a[0]));
        System.out.println("End");

    }
    
    public static int A(int []a,int idx,int max){
      
      if(idx==a.length) return max;
      if (a[idx]>max) {
      max=a[idx];
      }
      return A(a,idx+1,max);
        
    }
    
    
}