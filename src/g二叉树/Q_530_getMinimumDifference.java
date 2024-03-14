package g二叉树;

public class Q_530_getMinimumDifference {

    /**
     * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
     * 差值是一个正数，其数值等于两值之差的绝对值。
     * @param root
     * @return
     */
    int min = Integer.MAX_VALUE;
    int pre = 100001;
    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return min;
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left != null){
            getMinimumDifference(root.left);
        }
        if(Math.abs(root.val - pre) < min){
            System.out.println("插值为：" + (root.val - pre));
            min = Math.abs(root.val - pre);
        }
        System.out.println(min);
        pre = root.val;
        if(root.right != null){
            getMinimumDifference(root.right);
        }
    }
}
