package j动态规划.a基础题目;

public class b_70_climbStairs {

    /**
     * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
     * <p>
     * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
     */
    public int climbStairs(int n) {
        int[] num = new int[n+1];
        num[0] = 1;
        num[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            num[i] = num[i - 1] + num[i - 2];
        }
        return num[n];
    }

}
