package c哈希表;

import java.util.HashMap;

public class A_242_isAnagram {
    /**
     * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
     *
     * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            alphabet[t.charAt(i)-'a']--;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if(alphabet[i] != 0){
                return false;
            }
        }
        return true;

    }
}
