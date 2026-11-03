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
class Day6 {

    int ans = 0;

    public int longestZigZag(TreeNode root) {
        dfs(root, 0, 0);
        return ans;
    }

    void dfs(TreeNode node, int left, int right) {

        if (node == null) {
            return;
        }

        // Update maximum ZigZag length
        ans = Math.max(ans, Math.max(left, right));

        // Move LEFT: next move must be RIGHT
        dfs(node.left, right + 1, 0);

        // Move RIGHT: next move must be LEFT
        dfs(node.right, 0, left + 1);
    }
}