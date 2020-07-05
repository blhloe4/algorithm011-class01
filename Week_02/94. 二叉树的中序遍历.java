/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(InorderTraversalTest.TreeNode root) {
        helper(root);
        return list;
    }

    private void helper(InorderTraversalTest.TreeNode root) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left);
            }
            list.add(root.val);
            if (root.right != null) {
                helper(root.right);
            }
        }
    }
}