package Tree;

public class Main {
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }


    public static void main(String[] args) {
        Node first = new Node(2);
        Node second = new Node(3);
        Node third = new Node(4);
        Node fourth = new Node(5);

        first.left = second;
        first.right = third;
        second.left = fourth;

        Main main = new Main();
        main.inOrder(first);

    }
}
