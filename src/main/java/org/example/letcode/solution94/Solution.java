package org.example.letcode.solution94;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode() {}
TreeNode(int val) { this.val = val; }
 TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
class Solution {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(6);
        TreeNode treeNode4 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        System.out.println(new Solution().inorderTraversal(treeNode1));
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recurs(list,root);
        return list;
    }
    public void recurs(List list, TreeNode root){
        if(root!=null) {
                recurs(list, root.left);
            list.add(root.val);
                recurs(list, root.right);
        }
    }
}
