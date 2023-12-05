package org.example.letcode.solution104;

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
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.right = treeNode2;
        System.out.println(new Solution().maxDepth(treeNode));
    }
    public int maxDepth(TreeNode root) {
        return recurse(root,1);
    }
    private int recurse(TreeNode root, int deep){
        if(root == null){
            return 0;
        }
        if((root.left == null) && (root.right==null)){
            return deep;
        }
        if ((root.left != null) && (root.right==null)){
            return recurse(root.left,deep+1);
        }
        if ((root.left == null) && (root.right!=null)){
            return recurse(root.right,deep+1);
        }
        if ((root.left != null) && (root.right!=null)){
            int leftDeep = recurse(root.left,deep+1);
            int rightDeep = recurse(root.right,deep+1);
            if(leftDeep<rightDeep){
                return rightDeep;
            }else {
                return leftDeep;
            }
        }
        return 0;
    }
}