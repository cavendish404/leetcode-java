package g二叉树;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class M_654_constructMaximumBinaryTree {

    /**
     * 给定一个不重复的整数数组 nums 。 最大二叉树 可以用下面的算法从 nums 递归地构建:
     * 创建一个根节点，其值为 nums 中的最大值。
     * 递归地在最大值 左边 的 子数组前缀上 构建左子树。
     * 递归地在最大值 右边 的 子数组后缀上 构建右子树。
     * 返回 nums 构建的 最大二叉树 。
     * @param nums
     * @return
     */

    public TreeNode constructMaximumBinaryTree(int[] nums) {


        return build(nums, 0, nums.length-1);
    }

    public TreeNode build(int[] nums,int begin, int end){
        if(end < begin){
            return null;
        }

        int root_index = max(nums, begin, end);
        int root_val = nums[root_index];
        TreeNode node = new TreeNode(root_val);
        node.left = build(nums, begin, root_index - 1);
        node.right = build(nums, root_index + 1, end);
        return node;
    }

    public int max(int[] nums, int begin, int end){
        int max = begin;
        for (int i = begin; i <= end; i++) {
            if(nums[i] > nums[max]){
                max = i;
            }
        }
        return max;
    }
}
