package h回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class l_47_permuteUnique {

    /**
     *给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int[] used = new int[201];
        dfs(nums, result, path, used);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, int[] used) {
        if(path.size() == nums.length){
            System.out.println(path);
            result.add(new ArrayList<>(path));
            return;
        }
        int[] tag = new int[21];

        for (int i = 0; i < nums.length; i++) {

            if(tag[nums[i] + 10] == 1){
                continue;
            }
            if(used[i] != 1){
                tag[nums[i] + 10] = 1;
                used[i] = 1;
                path.add(nums[i]);
                dfs(nums, result, path,used);
                path.remove(path.size() - 1);
                used[i] = 0;
            }

        }
    }
}
