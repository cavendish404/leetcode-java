package h回溯;

import java.util.ArrayList;
import java.util.List;

public class k_46_permute {
    /**
     * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used = new int[107];
        dfs(nums, result, path, used);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, int[] used) {
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[nums[i] + 100] != 1){
                used[nums[i] +100] = 1;
                path.add(nums[i]);
                dfs(nums, result, path,used);
                path.remove(path.size() - 1);
                used[nums[i] +100] = 0;
            }

        }
    }
}
