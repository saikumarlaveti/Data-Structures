
public class TreeTest {
    static class   Node{
        Node left;
        Node right;
        int data;
        Node (int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public void display(Node root){
        if(root == null){
            return ;
        }
        else{
            display(root.left);
            System.out.print(root.data +  " ");
            display(root.right);
        }
    }

    public int  height(Node root){
        if(root == null){
            return 0;
        }
        else{
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            return Math.max(leftHeight,rightHeight)+1;
        }
    }

    public int  level(Node root){
        if(root == null){
            return 0;
        }
        else{
            int leftLevel = height(root.left);
            int rightLevel = height(root.right);
            return Math.max(leftLevel,rightLevel)+1;
        }
    }



        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2 );
            root.right = new Node(3);
            root.left.left = new Node(4);
//            root.left.right = new Node(5);
           // root.right.left = new Node(6);
           // root.right.right = new Node(7);

            TreeTest tt = new TreeTest();
            tt.display(root);
            System.out.println();
            System.out.println(tt.height(root));

            System.out.println();
            System.out.println(tt.level(root));


        }
}
