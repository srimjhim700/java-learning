
class Node {
    int data;
    Node left,right;

    Node(int data){
        this.data=data;
    }
}
public class BinaryTrees {

    static int index=0;
    public static Node Bit(int[] nodes){
        if(index>=nodes.length || nodes[index]==-1){
            index++;
            return null;
        }
        Node root = new Node(nodes[index]);
        index++;
        root.left =Bit(nodes);
        root.right=Bit(nodes);
        return root;
        
}
public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args){
        int[] nodes = {1,2,3,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root= Bit(nodes);
        System.out.println("In-order Traversal");
        inOrderTraversal(root);
    

    }
    
}
