package j动态规划.a基础题目;

public class f_343_integerBreak {

    /**
     * 给定一个正整数 n ，将其拆分为 k 个 正整数 的和（ k >= 2 ），并使这些整数的乘积最大化。
     *
     * 返回 你可以获得的最大乘积 。
     * @param n
     * @return
     */
    public int integerBreak(int n) {
        if(n <= 3){
            return n - 1;
        }
        int x = n / 3;
        int y = n % 3;
        if(y == 0){
            return (int) Math.pow(3, x);
        }else if(y == 1){
            return (int) Math.pow(3, x - 1) * 4;
        }else {
            return (int) Math.pow(3, x) * 2;
        }
    }
}
