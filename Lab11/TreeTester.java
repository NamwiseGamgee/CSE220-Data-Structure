public class TreeTester {
  public static void main (String[] args) {
    int a[]= {7,9,0,2,-16,1,10,8,-18,14,-59,64,77,83,50,88};
    int b[]= {7,9,0,2,-16,1,10,8,-18,14,-59,64,77,83,50,88};
    Tree t=new Tree(a);
    Tree t2=new Tree(b);
    t.createTree(a,1);
    t2.createTree(b,1);
    t.inOrderTraversal(t.root);
    System.out.println();
    t.preOrderTraversal(t.root);
    System.out.println();
    t.postOrderTraversal(t.root);
    System.out.println();
    System.out.println(t.sameKinaDekhtoVai(t.root,t2.root));
    int c[]= {7,9,0,2,-16,1,10,8,-18,14,-9,64,77,83,50,88}; //ekta element change korechi
    Tree t3=new Tree(c);
    System.out.println(t.sameKinaDekhtoVai(t.root,t3.root));
    Tree t4=new Tree();
    t4.root=t.copyTree(t.root);
    t4.inOrderTraversal(t4.root);
  }
}