package g二叉树;

/**
 * 给定一个二叉树，判断它是否是
 * 平衡二叉树
 */
public class H_110_isBalanced {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left - right) > 1 || !isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        return true;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
