package h回溯;

import java.util.ArrayList;
import java.util.List;

public class h_78_subsets {

    /**
     * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的
     * 子集
     * （幂集）。
     * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
     * @param nums
     * @return
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        result.add(new ArrayList<>(path));

        dfs(nums, result, path, 0);
        return result;
    }

    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, int begin){

        result.add(new ArrayList<>(path));

        for (int i = begin; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, result, path, i + 1);
            path.remove(path.size() - 1);
        }

    }
}
