package Tree.BST;


public class InsertValue {
    public static class Node{
        Node left;
        int data;
        Node right;
        Node (int data){
            this.data = data;
        }
    }

    public Node insert(Node root ,int data){
        if(root == null){
          return new Node(data);
        }
        //avoiding duplicate
        if(root.data == data){
            return root ;
        }
        else {
            if(root.data > data){
                root.left = insert(root.left,data);
            } else {
                 root.right = insert(root.right,data);
            }
        }
        return root;
    }

    public void inOrder(Node root){
        if(root ==  null) {
            return;
        }
        else{
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        InsertValue iv  = new InsertValue();
        Node root = null;
        root = iv.insert(root,5);
        root = iv.insert(root,2);
        root = iv.insert(root,2);

        iv.inOrder(root);
    }
}
