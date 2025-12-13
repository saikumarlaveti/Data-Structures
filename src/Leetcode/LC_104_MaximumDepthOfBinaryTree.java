package Leetcode;

import java.util.Arrays;

class  TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class LC_104_MaximumDepthOfBinaryTree {
    TreeNode root = null;

   public TreeNode insertValues(TreeNode root , int data){
       if(root == null){
           root = new TreeNode( data);
       }
       else {
           if(root.data>data){
             root.left =  insertValues(root.left,data);
           }
           else{
            root.right =  insertValues(root.right,data);
           }
       }
       return  root;
   }

   public void inOrder(TreeNode root){
       if(root == null) return ;
       else{
           inOrder(root.left);
           System.out.print(root.data + " ");
           inOrder(root.right);
       }
   }

    public int maxDepth(TreeNode root) {

       if(root == null) return 0 ;
      //  return root == null ? 0 : 1 + Math.max ( maxDepth(root.left) , maxDepth(root.right) );
     int left =  maxDepth(root.left);
     int right = maxDepth(root.right);
     int result = Math.max(left,right);
       return result+1; // including current node +1
    }
    public static void main(String[] args) {
            LC_104_MaximumDepthOfBinaryTree mdb = new LC_104_MaximumDepthOfBinaryTree();
            TreeNode root = new TreeNode(1);
            mdb.insertValues(root,2);
            mdb.insertValues(root,3);
            mdb.insertValues(root,5);
            mdb.inOrder(root);
        System.out.println(mdb.maxDepth(root));
    }
}
