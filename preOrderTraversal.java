/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<Treenode>();
        stack.push(root);
        while(!stack.isEmpty()){
            curr = stack.pop();
            // Neighbours of curr
            if(curr!=null)
            {
                list.add(curr.val);
                stack.push(curr.right);
                stack.push(curr.left);
            }
        }
        return list;   
    }
}