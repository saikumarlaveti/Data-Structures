package Tree.BST;

public class SearchElement {
    public class Node{
        Node left ;
        int data;
        Node right;
        Node (int data){
            this.data = data;
            left = right = null;
        }
    }

    public Node insertElement(Node root ,int data){
        if(root == null)
            return root = new Node(data);
        if(root.data == data)
                return root;
        else{
                if(root.data>data){
                    root.left = insertElement(root.left,data);
                }
                else{
                    root.right = insertElement(root.right,data);
                }
            }
        return root;
    }


    public void inOrder(Node root){
        if(root == null)
            return;
        else{
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    public Node Search(Node root,int key){
        if(root == null){
            return root;
        }
        if(root.data == key)
            System.out.println("Key Found");
        else if (root.data >key) {
            root.left = Search(root.left,key);
        }
        else
            root.right = Search(root.right,key);
        return root;
    }
    public static void main(String[] args) {
        Node root = null;
        SearchElement se = new SearchElement();

        root = se.insertElement(root,4);
        se.insertElement(root,5);
        se.insertElement(root,2);
        se.insertElement(root,10);
        se.insertElement(root,8);
        se.inOrder(root);
        se.Search(root,4);
    }
}
