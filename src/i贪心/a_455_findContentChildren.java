package i贪心;

import java.util.Arrays;

public class a_455_findContentChildren {

    /**
     * 假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。
     *
     * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。
     * 如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
     * 你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int[] eat = new int[g.length];
        int[] used = new int[s.length];
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if(used[j] != 1 && s[j] >= g[i]){
                    used[j] = 1;
                    eat[i] = 1;
                    break;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < eat.length; i++) {
            if(eat[i] == 1){
                sum++;
            }
        }
        return sum;
    }
}
