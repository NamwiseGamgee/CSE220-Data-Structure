public class QueueOverflowException extends Exception {
  String s="";
  public QueueOverflowException (String s) {
    this.s=s;
  }
  public String toString () {
  return s;
  }
}