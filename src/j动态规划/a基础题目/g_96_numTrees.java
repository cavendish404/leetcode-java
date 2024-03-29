package j动态规划.a基础题目;

import java.util.concurrent.ForkJoinPool;

public class g_96_numTrees {

    /**
     * 给你一个整数 n ，
     * 求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树 有多少种？
     * 返回满足题意的二叉搜索树的种数。
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j]*dp[i - 1 -j];
            }
        }
        return dp[n];
    }
}
