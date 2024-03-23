package j动态规划.a基础题目;

public class c_746_minCostClimbingStairs {

    /**
     * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。
     * 一旦你支付此费用，即可选择向上爬一个或者两个台阶。
     * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
     * 请你计算并返回达到楼梯顶部的最低花费。
     * @param cost
     * @return
     */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] sum = new int[n+1];
        for (int i = 2; i < n+1; i++) {
            sum[i] = Math.min(sum[i-1] + cost[i-1], sum[i-2] + cost[i-2]);
        }
        return sum[n];
    }
}
