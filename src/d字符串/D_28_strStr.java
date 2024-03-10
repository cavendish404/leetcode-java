package d字符串;

public class D_28_strStr {
    /**
     * 给你两个字符串 haystack 和 needle ，
     * 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
     * 如果 needle 不是 haystack 的一部分，则返回  -1 。
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        char[] p = needle.toCharArray();
        char[] s = haystack.toCharArray();

        // next
        int[] next = new int[m];
        int j = 0;
        next[0] = j;
        for (int i = 1; i < m; i++) {

            while (j > 0 && p[i] != p[j]) {
                j = next[j - 1];
            }
            if (p[i] == p[j]) {
                j++;
            }
            next[i] = j;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(next[i]);
        }

        // pattern
        j = 0;
        for (int i = 0; i < n; i++) {

            while (j > 0 && s[i] != p[j]) {
                j = next[j - 1];
            }
            if (s[i] == p[j]) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }


        return -1;
    }
}
