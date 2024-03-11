package g二叉树;

import java.security.cert.TrustAnchor;

public class K_112_hasPathSum {
    boolean tag = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        find(root, targetSum, 0);
        return tag;
    }

    public void find(TreeNode root, int targetSum, int sum){
        if(root == null){
            return;
        }
        sum += root.val;
        System.out.println(sum);
        if(root.right == null && root.left == null){
            if(sum == targetSum){
                tag = true;
            }
        }
        find(root.left, targetSum, sum);
        find(root.right, targetSum, sum);
    }
}
