package h回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e_40_combinationSum2 {

    /**
     * 给定一个候选人编号的集合 candidates 和一个目标数 target ，
     * 找出 candidates 中所有可以使数字和为 target 的组合。
     * candidates 中的每个数字在每个组合中只能使用 一次 。
     * 注意：解集不能包含重复的组合
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, path, result, 0, 0);
        return result;
    }

    public void dfs(int[] candidates, int target, List<Integer> path, List<List<Integer>> result, int sum, int begin) {

        if (sum > target) {
            return;
        }
        if (sum == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length; i++) {
            if(sum + candidates[i] > target){
                break;
            }
            if(i > begin && i < candidates.length && candidates[i] == candidates[i - 1]){
                continue;
            }
            path.add(candidates[i]);
            sum += candidates[i];
            dfs(candidates, target, path, result, sum, i+1);
            sum -= candidates[i];
            path.remove(path.size() - 1);

        }
    }
}
