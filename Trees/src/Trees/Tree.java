package Trees;

/*** How to create a tree in java ***/
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }

}
public class Tree {
    public static void main(String[] args) {
        Node root=new Node(80);
        root.left=new Node(60);
        root.left.left=new Node(10);
        root.left.right=new Node(70);
        root.right=new Node(90);
        root.right.left=new Node(85);
        root.right.right=new Node(110);
}
}
