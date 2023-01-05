public class Tree {
  Node root;
  public Tree() {
  }
  public Tree(int []a) {
    root= new Node(a[0],null,null,null);
  }
  public void createTree(int []a,int idx) {
    if(idx==a.length) return;
    Node newNode= new Node(a[idx],null,null,null);
    Node n=root;
    Node p=n;
    while(n!=null) {
      p=n;
      if(newNode.element<n.element) {
        n=n.left;
        
      }
      else {
        n=n.right;
      }
    }
    if (newNode.element>p.element) {
      p.right=newNode;
      newNode.parent=p;
    }
    else {
      p.left=newNode;
      newNode.parent=p;
    }
    createTree(a,idx+1); 
  }
  public void inOrderTraversal(Node n) {
    if (n==null) return;
    inOrderTraversal(n.left);
    System.out.print(n.element+"\t");
    inOrderTraversal(n.right);
  }
  public void preOrderTraversal(Node n) {
    if (n==null) return;
    System.out.print(n.element+"\t");
    preOrderTraversal(n.left);
    preOrderTraversal(n.right);
  }
  public void postOrderTraversal(Node n) {
    if (n==null) return;
    preOrderTraversal(n.left);
    preOrderTraversal(n.right);
    System.out.print(n.element+"\t");
  }
  public boolean sameKinaDekhtoVai(Node n1,Node n2) {
    if (n1==null && n2==null) return true;
    if(n1!=null && n2!=null) {
      return sameKinaDekhtoVai(n1.left,n2.left) && sameKinaDekhtoVai(n1.right,n2.right);
    }
    else return false;
  }
  public Node copyTree(Node n) {
  if (n==null) return null;
  Node newNode=new Node(n.element,copyTree(n.left),copyTree(n.right),null);
  return newNode;
  }
}