package Trees;

public class TreeTraversals {

/*** Inorder ***
 * order followed left---> root--> right
 */
    static void Inorder(Node root){
        if(root!=null){
            Inorder(root.left);
            System.out.print(root.data+"-->");
            Inorder(root.right);
        }
    }
    /*** PreOrder ***
     * order followed root---> left--> right
     */
    static void Preorder(Node root){
        if(root!=null){
            System.out.print(root.data+"-->");
            Preorder(root.left);
            Preorder(root.right);
        }
    }
    /*** PreOrder ***
     * order followed left--> right-->root
     */
    static void Postorder(Node root){
        if(root!=null){
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+"-->");
        }
    }

    public static void main(String[] args) {
        Node root=new Node(80);
        root.left=new Node(60);
        root.left.left=new Node(10);
        root.left.right=new Node(70);
        root.right=new Node(90);
        root.right.left=new Node(85);
        root.right.right=new Node(110);

        //print
//        Inorder(root);
        Preorder(root);
        System.out.println("\npostorder");
        Postorder(root);

    }

}
