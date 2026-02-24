/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int dfs(TreeNode root,int n){
        if(root==null) return 0;
        n=n*2+root.val;
        if(root.left==root.right) return n;
        return dfs(root.left,n)+dfs(root.right,n);
    }
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
}