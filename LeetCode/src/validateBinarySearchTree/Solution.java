package validateBinarySearchTree;

import entity.TreeNode;

public class Solution {
	public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
	
	private boolean valid(TreeNode root, long low, long high) {
		if(root == null) return true;
		
		if(root.val <= low || root.val >= high) return false;
		
		return valid(root.left, low, root.val) && valid(root.right, root.val, high);
	}
}
