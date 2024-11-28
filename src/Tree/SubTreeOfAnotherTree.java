package Tree;

public class SubTreeOfAnotherTree {
    public boolean isIdentical(Node root ,Node subroot){
        if(root == null && subroot == null){
            return true;
        }
        else if(root == null || subroot == null || root.data != subroot.data){
            return false;
        }

        if(!isIdentical(root.left,subroot.left)){
            return false;
        }
        if(!isIdentical(root.right,subroot.right)){
            return false;
        }
        return true;
    }
    public boolean isSubtree(Node root , Node subroot){
        if(root ==null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        }
//        boolean leftres = isSubtree(root.left,subroot);
//        boolean rightres = isSubtree(root.right,subroot);
//        return leftres || rightres ;  -->three lines convert into one line

        return isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2 );
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node  subroot= new Node(2);
       subroot.left = new Node(4);
        subroot.right = new Node(5);

        SubTreeOfAnotherTree st = new SubTreeOfAnotherTree();
        st.inOrder(root);
        System.out.println();
        st.inOrder(subroot);

        System.out.println(st.isSubtree(root,subroot));


    }
}
