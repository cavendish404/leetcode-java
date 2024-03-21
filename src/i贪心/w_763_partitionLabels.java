package i贪心;

import java.util.ArrayList;
import java.util.List;

public class w_763_partitionLabels {

    /**
     * 给你一个字符串 s 。我们要把这个字符串划分为尽可能多的片段，同一字母最多出现在一个片段中。
     * 注意，划分结果需要满足：将所有划分结果按顺序连接，得到的字符串仍然是 s 。
     * 返回一个表示每个字符串片段的长度的列表。
     * @param s
     * @return
     */
    public List<Integer> partitionLabels(String s) {
        int n = s.length();
        List<Integer> result = new ArrayList<>();
        int[] alpha = new int[26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            alpha[ch - 'a'] = i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            end = Math.max(end, alpha[ch - 'a']);
            if(i == end){
                result.add(end - start + 1);
                start = end + 1;
            }

        }

        return result;
    }
}
