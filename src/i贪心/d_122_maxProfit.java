package i贪心;

public class d_122_maxProfit {

    /**
     * 给你一个整数数组 prices ，其中 prices[i] 表示某支股票第i天的价格。
     * 在每一天，你可以决定是否购买和/或出售股票。你在任何时候 最多 只能持有 一股 股票。
     * 你也可以先购买，然后在 同一天 出售。
     * 返回 你能获得的 最大 利润 。
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int num = prices[i] - prices[i - 1];
            if(num > 0){
                sum += num;
            }
        }
        return sum;
    }
}
