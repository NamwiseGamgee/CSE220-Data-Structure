public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start=st;
    size=sz;
    int k=st;
    cir=new Object[lin.length];
    for (int i=0;i<sz;i++) {
      cir[k]=lin[i];
      k=(k+1)%cir.length;
    }
    System.out.println();
  }
  //----------------------------------------------------------------------------------------
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    for (int i=0;i<cir.length;i++) {
      System.out.print(cir[i]+"\t");
    } 
    System.out.println();
  }
  //----------------------------------------------------------------------------------------
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    int k=start;
    for (int i=0;i<size;i++) {
      System.out.print(cir[k]+"\t");
      k=(k+1)%cir.length;
    }
    System.out.println();
  }
  
  //----------------------------------------------------------------------------------------
  public void printBackward(){
    int k=0;
    for (int i=0;i<size;i++) {
      System.out.print(cir[k]+"\t");
      k--;
      if(k<0) {
        k=cir.length-1;
      }
    }
    System.out.println();
  }
  //----------------------------------------------------------------------------------------
  // With no null cells
  public void linearize(){
    Object []lin=new Object[size];
    int k=start;
    for (int i=0;i<lin.length;i++) {
      lin[i]=cir[k];
      k=(k+1)%cir.length;
    }
    cir=lin;
  }
  //----------------------------------------------------------------------------------------
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    Object b[]=new Object[newcapacity];
    int k=start;
    int j=start;
    for (int i=0;i<size;i++) {
      b[k]=cir[j];
      k=(k+1)%b.length;
      j=(j+1)%cir.length;
    }
    cir=b;
  }
  //----------------------------------------------------------------------------------------
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    Object b[]=new Object[newcapacity];
    int k=start;
    for (int i=0;i<size;i++) {
      b[i]=cir[k];
      k=(k+1)%cir.length;
      
    }
    cir=b;
    
  }
  //----------------------------------------------------------------------------------------
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    if (size==cir.length) {
      resizeStartUnchanged(cir.length+3);
    }
    Object b[]=new Object[cir.length];
    int k=start;
    
    for (int i=0,j=start;i<size;i++) {
      if (k==start+pos) {
        b[k]=elem;
        size++;
        
      }
      else {
        b[k]=cir[j];
        j=(j+1)%cir.length; //jotobar else e asbe toto baroi j er man change hobe but k er man protibaroi change hobe
      }
      k=(k+1)%cir.length;
    }
    cir=b;
  }
  
  //----------------------------------------------------------------------------------------
  public void insertByLeftShift(Object elem, int pos){
    if (size==cir.length) {
      resizeStartUnchanged(cir.length+3);
    }
    Object b[]=new Object[cir.length];
    
    
    for (int k=b.length-1,j=cir.length-1;k>=0;k--) {
      if (k==start+pos) {
        b[k]=elem;
        size++;
      }
      else {
        b[k]=cir[j];
        j=j-1;
      }
      
    }
    cir=b;
    start=start-1;
  }
  //----------------------------------------------------------------------------------------
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    Object b[]=new Object[cir.length];
    int k=start;
    int j=start;
    for (int i=0;i<size;i++) {
      if (j==(start+pos)) {
        j=(j+1)%cir.length;
        b[k]=cir[j];
        size--;
      }
      else {
        b[k]=cir[j];
        
      }
      k=(k+1)%b.length;
      j=(j+1)%cir.length;
      
    }
    cir=b;
  }
  //----------------------------------------------------------------------------------------
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    Object b[]=new Object[cir.length];
    int k=start+1;
    int j=start;
    for (int i=0;i<size;i++) {
      if (j==(start+pos)) {
        j=(j+1)%cir.length;
        b[k]=cir[j];
        size--;
      }
      else {
        b[k]=cir[j];
        
      }
      k=(k+1)%b.length;
      j=(j+1)%cir.length;
      
    }
    start=start+1;
    cir=b;
  }
  
  //----------------------------------------------------------------------------------------
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
    boolean yeahoooo_PalindromeHotePare=false;
    int k=start; //start theke shuru korte hobe.
    int j=(start+size-1)%cir.length;
    
    for (int i=0;i<(size/2);i++) {
      if (cir[k]==cir[j]) {
        yeahoooo_PalindromeHotePare=true;
      }
      else {
        yeahoooo_PalindromeHotePare=false;
        break;
      }
      k=(k+1)%cir.length;
      j--;
      if (j==-1) {
        j=cir.length-1;
      }
    }
    if(yeahoooo_PalindromeHotePare) {
      System.out.println("This array is a palindrome.");
    }
    else {
      System.out.println("This array is not a palindrome.");
    }
  }
  
  //----------------------------------------------------------------------------------------
  //This method will sort the values by keeping the start unchanged
  public void sort(){
    int b[]=new int[size];
    
    int k=start;
    for (int i=0;i<b.length;i++) {
      b[i]=(Integer)cir[k];
      k=(k+1)%cir.length;
    }
    
    int min=0;
    int minLoc=0;
    for (int i=0;i<b.length-1;i++) {
      min=b[i];
      minLoc=i;
      int temp;
      for (int j=i+1;j<b.length;j++) {
        if (b[j]<min) {
          minLoc=j;
          min=b[j];
        }
      }
      temp=b[i];
      b[i]=min;
      b[minLoc]=temp;
    }
    k=start;
    for (int i=0;i<b.length;i++) {
      cir[k]=b[i];
      k=(k+1)%cir.length;
    }
  }
  
  //----------------------------------------------------------------------------------------
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    int s=start;
    
    int j=k.start;
    
    boolean flag=false;
    if (size!=k.size) {
      return flag;
    }
    else {
      for (int i=0;i<size;i++) {
        if ((Integer)cir[s]==(Integer)k.cir[j]) {
          flag=true;
        }
        else {
          flag=false;
          break;
        }
        
        s=(s+1)%cir.length;
        j=(j+1)%k.cir.length;
      }
    }
    
    return flag;
  }
}