package h回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class i_90_subsetsWithDup {

    /**
     * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
     * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, result, path, 0);
        return result;
    }

    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, int begin){
        result.add(new ArrayList<>(path));

        for (int i = begin; i < nums.length; i++) {
            if(i > begin && nums[i] == nums[i - 1]){
                continue;
            }
            path.add(nums[i]);
            dfs(nums, result, path, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
