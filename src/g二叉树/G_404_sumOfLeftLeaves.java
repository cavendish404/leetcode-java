package g二叉树;

public class G_404_sumOfLeftLeaves {

    /**
     * 定二叉树的根节点 root ，返回所有左叶子之和。
     *
     *
     * @param root
     * @return
     */

    public int sumOfLeftLeaves(TreeNode root) {

        if(root == null){
            return 0;
        }
        if(root.left != null && root.left.left == null && root.left.right == null){
            return root.left.val + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }else{
            return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }

    }
}
