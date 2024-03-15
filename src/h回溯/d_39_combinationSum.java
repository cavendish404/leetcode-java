package h回溯;

import java.util.ArrayList;
import java.util.List;

public class d_39_combinationSum {

    /**
     * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，
     * 找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。
     * 你可以按 任意顺序 返回这些组合。
     * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。
     * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
     *
     * @param candidates
     * @param target
     * @return
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
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
            path.add(candidates[i]);
            sum += candidates[i];
            dfs(candidates, target, path, result, sum, i);
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }
}
