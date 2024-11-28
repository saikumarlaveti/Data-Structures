package Tree;

public class KthLevel {
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

//        public int level(Node root)
//        {
//            if(root == null){
//                return 0 ;
//            }
//            else{
//                int left = level(root.left);
//                int right = level(root.right);
//                return Math.max(left,right)+1;
//            }
//        }
   public void findKth(Node root,int level , int k){
        if(root == null){
            return ;
        }
        if(level == k){
            System.out.print(root.data + " ");
            return;
        }
        else{
            findKth(root.left,level+1,k);
            findKth(root.right,level+1,k);
        }
   }



        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2 );
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
             root.right.left = new Node(6);
             root.right.right = new Node(7);
             KthLevel kl = new KthLevel();
             kl.display(root);
            System.out.println("Kth Level");
            System.out.println();

                 kl.findKth(root,1,3);


        }
    }

