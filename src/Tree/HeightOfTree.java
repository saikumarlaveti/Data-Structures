package Tree;

public class HeightOfTree {
    static class Node{
        int data;
        Node left;
        Node right;
      public   Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

        public int Height(Node root){
        if(root == null){
            return 0 ;
        }
        else {
            int lh = Height(root.left);
            int rh = Height(root.right);
            return  Math.max(lh,rh) +1;
        }
        }
        public int diameter(Node root){
        if(root == null){
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        int leftDiam = diameter(root.left);
        int rightDiam = diameter(root.right);

        int selfDiam = lh + rh + 1;
        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
        }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        //root.left.left.left = new Node(10);


        HeightOfTree ht = new HeightOfTree();
        int height  = ht.Height(root);
        System.out.println(" Height of the tree - " + height);

        System.out.println(ht.diameter(root));
    }

}
