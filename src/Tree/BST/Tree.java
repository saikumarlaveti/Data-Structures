package Tree.BST;

import java.util.ArrayList;

class Node {
    Node left;
    int data;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
}

class BST{
    public Node insert(Node root, int data){
        if(root == null) {
            return root = new Node(data);
        }
        else {
            if(root.data > data){
                root.left = insert(root.left,data);
            }
            else{
                root.right = insert(root.right,data);
            }
        }
        return root;
    }

    public void inOrder(Node root){
        if(root == null)
            return;
        else{
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public boolean search(Node root,int data){
        if(root == null)
                return false;
        if(root.data == data)
                return true;

        else{
            if(root.data > data){
              return    search(root.left,data);
            }
            else{
               return search(root.right,data);
            }
        }
    }

    public Node delete(Node root,int data){
        if(root.data > data){
            root.left = delete(root.left,data);
        }
        else if (root.data < data){
            root.right = delete(root.right,data);
        }
        else {
            //case : 1 leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case : 2 child node
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            //case :3 both children
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public Node findInOrderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public void printRange(Node root,int key1,int key2){
        if(root == null){
            return ;
        }
         if (root.data >= key1 && root.data <= key2) {
            printRange(root.left ,key1,key2);
            System.out.print(root.data + " ");
            printRange(root.right,key1,key2);
        }
        else if (root.data >key1) {
            printRange(root.left,key1,key2);
        }
        else {
            printRange(root.right,key1,key2);
        }
    }
public void printPath(ArrayList<Integer> path){
        for(int i =0;i< path.size();i++){
            System.out.print(path.get(i)+ " ");
        }
    System.out.println("-> null" );
}
    public void rootOfTheRootPath(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        rootOfTheRootPath(root.left,path);
        rootOfTheRootPath(root.right,path);
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        BST bst = new BST();
        Node root = null;
        root = bst.insert(root,8);
        bst.insert(root,5);
        bst.insert(root,10);
        bst.insert(root,3);
        bst.insert(root,6);
        bst.insert(root,1);
        bst.insert(root,4);
        bst.insert(root,11);
        bst.insert(root,14);
        bst.inOrder(root);
        System.out.println();
        ArrayList<Integer> path = new ArrayList<>();
        bst.rootOfTheRootPath(root,path);





    }
}