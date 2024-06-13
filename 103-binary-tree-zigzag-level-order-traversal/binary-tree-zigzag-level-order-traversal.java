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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        travel(root, ans, 0);
        return ans;
    }
    private void travel(TreeNode curr, List<List<Integer>> ans, int level){
        if(curr == null)    return;
        if(ans.size() <= level){
            List<Integer> newLevel = new LinkedList<>();
            ans.add(newLevel);
        }
        List<Integer> collection = ans.get(level);
        if(level%2==0)  collection.add(curr.val);
        else    collection.add(0, curr.val);

        travel(curr.left, ans, level+1);
        travel(curr.right, ans, level+1);
    }
}