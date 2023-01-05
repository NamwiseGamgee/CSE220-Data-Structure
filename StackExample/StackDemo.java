import java.util.*; 
  
public class StackDemo { 
    public static void main(String args[]) 
    { 
        // Creating an empty Stack 
        Stack<Integer> st = new Stack<Integer>(); 
  
        // Use push() to add elements into the Stack 
        st.push(10); 
        st.push(15); 
        st.push(30); 
        st.push(20); 
        st.push(5); 
  
        // Displaying the Stack 
        System.out.println("Initial Stack: " + st); 
  
        // Fetching the element at the head of the Stack 
        System.out.println("The element at the top of the"
                           + " stack is: " + st.peek()); 
  
        // Displaying the Stack after the Operation 
        System.out.println("Final Stack: " + st); 
    } 
} 