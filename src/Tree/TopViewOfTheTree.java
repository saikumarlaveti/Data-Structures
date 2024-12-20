package Tree;

public class TopViewOfTheTree {
    public void displayTopView(Node root){
        if(root == null){
            return;
        }
        else if(root != null) {
            displayTopView(root.left);
            System.out.print(root.data+ " ");
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

        TopViewOfTheTree tvt = new TopViewOfTheTree();
        tvt.displayTopView(root);
    }
}
