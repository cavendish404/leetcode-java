package h回溯;

import java.util.*;

public class a_77_combine {

    /**
     * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
     * <p>
     * 你可以按 任何顺序 返回答案。
     *
     * @param n
     * @param k
     * @return
     */
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        if (k < 0 || n < k) {
            return result;
        }

        dfs(n, k, 1, path);
        return result;
    }

    public void dfs(int n, int k, int begin, List<Integer> path) {
        if (path.size() == k) {

            result.add(new ArrayList<>(path));
            System.out.println(path);

            return;
        }
        for (int i = begin; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            dfs(n, k, i + 1, path);
            path.remove(path.size() - 1);
        }
    }


}
