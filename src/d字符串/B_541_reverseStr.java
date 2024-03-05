package d字符串;

import java.util.Arrays;

public class B_541_reverseStr {

    /**
     * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
     *
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     * @param s
     * @param k
     * @return
     */
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < n; i += 2*k) {
            reverse(charArray, i, Math.min(i+k-1, n-1));
        }
        String result = new String(charArray);
        return result;
    }
    public void reverse(char[] s, int i, int j){
        for(; i < j; i++, j--){
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
        }
    }

//    public static void main(String[] args) {
//        char[] num = {'a','b'};
//        System.out.println(Arrays.toString(num));
//        System.out.println(new String(num));
//    }
}
