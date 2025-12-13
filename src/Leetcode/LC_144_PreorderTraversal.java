package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LC_144_PreorderTraversal {
   static class  TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        private TreeNode root = null;

        public TreeNode insertData(TreeNode root, int data) {
            if (root == null) {
                return new TreeNode(data);
            } else if (data < root.data) {
                root.left = insertData(root.left, data);
            } else {
                root.right = insertData(root.right, data);
            }
            return root;
        }
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrderHelper(root,list);
        return list;
    }

    private void preOrderHelper(TreeNode root, List<Integer> list) {
        if(root == null){
            return;
        }
        list.add(root.data);
        preOrderHelper(root.left,list);
        preOrderHelper(root.right,list);
    }

    public static void main(String[] args) {
        TreeNode tn = new TreeNode(1);
        tn.insertData(tn,20);
        tn.insertData(tn, 2);
        tn.insertData(tn,33);
        tn.insertData(tn,4);
        tn.insertData(tn,3);
        LC_144_PreorderTraversal it = new LC_144_PreorderTraversal();
        List<Integer>result = it.preorderTraversal(tn);
        System.out.println(result);

    }
}


