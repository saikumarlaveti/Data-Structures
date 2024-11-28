package Tree;

import java.util.*;
import java.util.LinkedList;

class Main{

    public  void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }
    public  void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root ==  null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            }else{
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
        }
    }
    static int count = 0;
    public int count (Node root){
        if(root == null){
            return 0;
        }
        else {
            count++;
            count(root.left);
            count(root.right);
        }
        return count;
    }

    public int count_1(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = count_1(root.left);
        int rightCount = count_1(root.right);


        return leftCount+rightCount+1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        Node firstL  = new Node(2);
        Node firstR = new Node(3);

        Node secondLL = new Node(4);
        Node secondLR = new Node(5);

        Node secondRL = new Node(6);
        Node secondRR = new Node(7);

        root.left = firstL;
        root.right = firstR;

        firstL.left = secondLL;
        firstL.right = secondLR;

        firstR.left = secondRL;
        firstR.right = secondRR;

        Main main  = new Main();
        System.out.println("Tree traversal: InOrder ");
        main.inOrder(root);
        System.out.println("\nTree traversal: preOrder");
        main.preOrder(root);
        System.out.println("\nTree traversal: postOrder ");
        main.postOrder(root);
        System.out.println(  );
        main.levelOrder(root);

        System.out.println("Count of the tree :");
        int count  = main.count(root);
        System.out.println(count);
        System.out.println(main.count_1(root));
    }
}