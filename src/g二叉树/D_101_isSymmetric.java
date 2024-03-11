package g二叉树;

public class D_101_isSymmetric {
    /**
     * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        TreeNode left = root.left;
        TreeNode right = root.right;
        boolean isSame = isSame(left, right);

        return isSame;
    }

    public boolean isSame(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if((t1 == null && t2 != null) || (t2 == null && t1 != null)){
            return false;
        }
        if(t1.val != t2.val){
            return false;
        }
        if(!isSame(t1.right, t2.left) || !isSame(t1.left, t2.right)){
            return false;
        }
        return true;
    }
}
