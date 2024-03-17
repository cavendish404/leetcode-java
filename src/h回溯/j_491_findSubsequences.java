package h回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class j_491_findSubsequences {

    /**
     * 给你一个整数数组 nums ，找出并返回所有该数组中不同的递增子序列，
     * 递增子序列中 至少有两个元素 。
     * 你可以按 任意顺序 返回答案。
     * 数组中可能含有重复元素，如出现两个整数相等，也可以视作递增序列的一种特殊情况。
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(nums, result, path, 0);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, int begin) {
        if (path.size() > 1) {
            result.add(new ArrayList<>(path));
        }
        int[] used = new int[201];
        for (int i = begin; i < nums.length; i++) {
            if ((i > 0  && !path.isEmpty() && nums[i] < path.get(path.size()- 1) ) || used[nums[i] + 100] == 1) {
                continue;
            }
            used[nums[i] + 100] = 1;
            path.add(nums[i]);
            dfs(nums, result, path, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
