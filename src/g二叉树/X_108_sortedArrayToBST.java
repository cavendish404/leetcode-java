package g二叉树;

import javax.swing.plaf.PanelUI;

public class X_108_sortedArrayToBST {

    /**
     * 给你一个整数数组 nums ，
     * 其中元素已经按 升序 排列，请你将其转换为一棵
     * 平衡二叉搜索树。
     *
     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    public TreeNode dfs(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = dfs(nums, left, mid - 1);
        node.right = dfs(nums, mid + 1, right);
        return node;

    }
}
