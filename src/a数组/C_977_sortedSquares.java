package a数组;

import java.util.Arrays;

public class C_977_sortedSquares {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] sq = sortedSquares(nums);
        for (int u : sq) {
            System.out.println(u);
        }
    }

    /*
        给你一个按 非递减顺序 排序的整数数组 nums，
        返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。

        示例 1：
        输入：nums = [-4,-1,0,3,10]
        输出：[0,1,9,16,100]
        解释：平方后，数组变为 [16,1,0,9,100]
        排序后，数组变为 [0,1,9,16,100]

        示例 2：
        输入：nums = [-7,-3,2,3,11]
        输出：[4,9,9,49,121]
     */
    public static int[] sortedSquares(int[] nums) {
        int[] double_num = nums;
        for (int i = 0; i < double_num.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(double_num);
        return double_num;
    }
}
