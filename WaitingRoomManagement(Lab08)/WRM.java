public class WRM {
  int size;
  int front;
  int rear;
  Patient p[];
  public WRM () {
    p=new Patient[5];
    front=0;
    rear=0;
    size=0;
  }
  public void RegisterPatient(String n,String b,int a) throws QueueOverflowException {
    if (size==p.length) {
      throw new QueueOverflowException("Vai line e jayga nai. Pore asen please");
    }
    else {
      p[rear]=new Patient(n,b,a);
      size++;
      rear=(rear+1)%p.length;
    }
  }
  public Patient ServePatient() throws QueueUnderflowException {
    if (size==0) {
      throw new QueueUnderflowException("Line khali");
    }
    else {
      int temp=front;
      front=(front+1)%p.length;
      size--;
      return p[temp];
    }
  }
  
  public void CancelAll(){
    Patient notunLine[]=new Patient[5];
    p=notunLine;
    size=0;
    front=0;
    rear=0;
    System.out.println("All the appointments has been cancelled");
  }
  public void CanDoctorGoHome(){
    if (size==0 || front==rear) {
    System.out.println("Yes, You can go home now Doctor. Have a good day.");
    }
    else {
    System.out.println("No, You can't go home now Doctor. Patients are still waiting.");
    }
  }
  public void ShowAllPatient() throws QueueUnderflowException {
    if (size==0) {
    throw new QueueUnderflowException("No one's here");
    }
    else {
      System.out.println("Showing patient list- ");
      for (int i=front;i!=rear;i=(i+1)%p.length) {
      System.out.println(p[i]);
      }
    }
  }
}