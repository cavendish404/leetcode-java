package h回溯;

import java.util.ArrayList;
import java.util.List;

public class b_216_combinationSum3 {

    /**
     * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
     * 只使用数字1到9
     * 每个数字 最多使用一次
     * 返回 所有可能的有效组合的列表 。
     * 该列表不能包含相同的组合两次，组合可以以任何顺序返回。
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(k, n, 1, path, 0, result);
        return result;
    }

    public void dfs(int k, int n, int begin, List<Integer> path, int sum, List<List<Integer>> result){
        if(n <= 0 || sum > n){
            return;
        }
        if(path.size() == k){
            if(sum == n){
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = begin; i < 10 - (k - path.size()) + 1; i++) {
            path.add(i);
            sum += i;
            dfs(k, n, i + 1, path, sum, result);
            path.remove(path.size() - 1);
            sum -= i;
        }
    }
}
