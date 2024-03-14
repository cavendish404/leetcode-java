package g二叉树;

public class P_98_isValidBST {

    /**
     * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
     * 有效 二叉搜索树定义如下：
     * 节点的左子树
     * 只包含 小于 当前节点的数。
     * 节点的右子树只包含 大于 当前节点的数。
     * 所有左子树和右子树自身必须也是二叉搜索树。
     * @param root
     * @return
     */

    /**
     * 中序遍历记录在数组里
     */
//    int index = 0;
//    public boolean isValidBST(TreeNode root) {
//        int[] nums = new int[10000];
//        inOrder(root, nums);
//        for (int i = 0; i < index; i++) {
//            System.out.println(nums[i]);
//        }
//        for (int i = 1, j = 0; i < index; i++ , j++) {
//            if(nums[i] <= nums[j]){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public void inOrder(TreeNode root, int[] nums){
//        if(root == null){
//            return;
//        }
//        if(root.left != null){
//            inOrder(root.left, nums);
//        }
//
//        nums[index++] = root.val;
//        if(root.right != null){
//            inOrder(root.right, nums);
//        }
//    }

    long pre = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }
        if(root.left != null){
            if(!isValidBST(root.left)){
                return false;
            }
        }
        if(root.val <= pre){
            return false;
        }
        pre = root.val;
        if(root.right != null){
            if(!isValidBST(root.right)){
                return false;
            }
        }
        return true;
    }
}
