public class TesterF {
  public static void main(String[] args) {
    Patient []p=new Patient[3];
    WRM wrm=new WRM();
    try {
      wrm.RegisterPatient("Sworon","B+ve",29);
      System.out.println("Served patient -"+wrm.ServePatient());
      wrm.RegisterPatient("Pranto","B+ve",20);
      wrm.RegisterPatient("Solaiman","AB+ve",21);
      System.out.println("Served patient -"+wrm.ServePatient());
      System.out.println("Served patient -"+wrm.ServePatient());
      System.out.println("Served patient -"+wrm.ServePatient());
    }
    catch (Exception e){
      System.out.println(e);
    }
    try {
      wrm.RegisterPatient("Naeem","AB+ve",19);
      wrm.RegisterPatient("Jahidul","O+ve",21);
      wrm.RegisterPatient("Ayon","AB+ve",19);
      wrm.RegisterPatient("Maruf","O+ve",34);
      wrm.RegisterPatient("Rakibullah","B+ve",17);
      wrm.RegisterPatient("Shuor","B+ve",29);
    }
    catch(Exception e) {
      System.out.println(e);
    }
    
    try { 
      System.out.println("Served patient -"+wrm.ServePatient());
      System.out.println("Served patient -"+wrm.ServePatient());
      wrm.ShowAllPatient();
    }
    catch(Exception e) {
      System.out.println(e);
    }
    finally { 
      wrm.CanDoctorGoHome();
      wrm.CancelAll();
      wrm.CanDoctorGoHome();
      
    }
    try {
      wrm.ShowAllPatient();
    }
    catch(Exception e) {
      System.out.println(e);
    }
  }
}