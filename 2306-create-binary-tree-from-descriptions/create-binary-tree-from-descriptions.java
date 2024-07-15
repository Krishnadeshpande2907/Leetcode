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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Set<Integer> childrenSet = new HashSet<>();
        HashMap<Integer, int[]> childrenMap = new HashMap<>();
        for(int[] desc : descriptions){
            int parent = desc[0];
            int child = desc[1];
            boolean isLeft = desc[2] == 1;

            childrenMap.putIfAbsent(parent, new int[]{-1, -1});
            childrenSet.add(child);

            if(isLeft)  childrenMap.get(parent)[0] = child;
            else    childrenMap.get(parent)[1] = child;
        }

        int headNodeVal = 0;
        for(int parent : childrenMap.keySet()){
            if(!childrenSet.contains(parent)){
                headNodeVal = parent;
                break;
            }
        }
        return constructTree(headNodeVal, childrenMap);
    }
    private TreeNode constructTree(int curNodeVal, Map<Integer, int[]> childrenMap){
        TreeNode newNode = new TreeNode(curNodeVal);
        if(childrenMap.containsKey(curNodeVal)){
            int[] children = childrenMap.get(curNodeVal);
            if(children[0] != -1)   newNode.left = constructTree(children[0], childrenMap);
            if(children[1] != -1)   newNode.right = constructTree(children[1], childrenMap);
        }
        return newNode;
    }
}