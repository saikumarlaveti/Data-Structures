package Tree.BST;

public class DeleteValue {
    class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public Node insert(int data, Node root) {
        if (root == null)
            root = new Node(data);
        if(root.data == data)
            return root;
         else {
            if (root.data > data) {
                root.left = insert(data, root.left);
            } else {
                root.right = insert(data,root.right);
            }
        }
        return root;
    }

    public void print(Node root){
        if(root == null)
            return;
        else {
            print(root.left);
            System.out.print(root.data+" ");
            print(root.right);
        }
    }

    public void remove(int data,Node root){
        if(root == null){
            return;
        }
        
    }

    public static void main(String[] args) {
        Node root = null;
        DeleteValue dv = new DeleteValue();
        root = dv.insert(1,root);
        dv.insert(22,root);
        dv.insert(3,root);
        dv.insert(2,root);
        dv.print(root);

    }

}