public class QueueUnderflowException extends Exception {
  String s="";
  public QueueUnderflowException (String s) {
    this.s=s;
  }
  public String toString () {
  return s;
  }
}