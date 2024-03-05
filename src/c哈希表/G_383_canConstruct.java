package c哈希表;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class G_383_canConstruct {
    /**
     * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
     * <p>
     * 如果可以，返回 true ；否则返回 false 。
     * <p>
     * magazine 中的每个字符只能在 ransomNote 中使用一次。
     *
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (map1.containsKey(ransomNote.charAt(i))) {
                map1.put(ransomNote.charAt(i), map1.get(ransomNote.charAt(i)) + 1);
            } else {
                map1.put(ransomNote.charAt(i), 1);
            }
        }
        for (int i = 0; i < magazine.length(); i++) {
            if (map1.containsKey(magazine.charAt(i))) {
                map1.put(magazine.charAt(i), map1.get(magazine.charAt(i)) - 1);
            }
        }
        /*
        Set<Map.Entry<Character, Integer>> entries = map1.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if(entry.getValue() > 0){
                return false;
            }
        }

         */
        for (Character c : map1.keySet()) {
            if (map1.get(c) != 0) {
                return false;
            }
        }
        return true;
    }
}
