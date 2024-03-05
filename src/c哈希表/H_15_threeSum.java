package c哈希表;

import java.util.*;

public class H_15_threeSum {

    /**
     * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
     * <p>
     * 你返回所有和为 0 且不重复的三元组。
     * <p>
     * 注意：答案中不可以包含重复的三元组。
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int a = i, b = i + 1, c = nums.length - 1;
            if (nums[a] > 0) {
                return result;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (b < c) {
                if (nums[a] + nums[b] + nums[c] > 0) {
                    c--;
                } else if (nums[a] + nums[b] + nums[c] < 0) {
                    b++;
                } else {
                    result.add(Arrays.asList(nums[a], nums[b], nums[c]));
                    while (b < c && nums[c] == nums[c - 1]) {
                        c--;
                    }
                    while (b < c && nums[b] == nums[b + 1]) {
                        b++;
                    }
                    c--;
                    b++;
                }
            }
        }
        return result;
    }
}
