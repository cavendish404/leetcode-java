package i贪心;

import java.util.ArrayList;
import java.util.List;

public class y_738_monotoneIncreasingDigits {

    /**
     * 当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。
     *
     * 给定一个整数 n ，返回 小于或等于 n 的最大数字，且数字呈 单调递增 。
     * @param n
     * @return
     */
    public int monotoneIncreasingDigits(int n) {
        if(n < 10){
            return n;
        }
        char[] chars = Integer.toString(n).toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
        int len = chars.length;
        for (int i = len - 2; i >= 0; i--) {
            if(chars[i] > chars[i+1]){
                chars[i]--;

                for (int j = i + 1; j < len; j++) {
                    chars[j] = '9';
                }
            }
        }
        int res = Integer.parseInt(new String(chars));

        return res;
    }
}
