public class Patient {
  String name="";
  int age;
  String bg="";
  public Patient(String n,String b,int a) {
    name=n;
    bg=b;
    age=a;
  }
  public String toString () {
    return name+" ,Blood Group - "+bg+" , Age - "+age;
  } 
  
}