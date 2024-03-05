package c哈希表;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class B_1002_commonChars {
    /**
     * 给你一个字符串数组 words ，
     * 请你找出所有在 words 的每个字符串中都出现的共用字符（ 包括重复字符），
     * 并以数组形式返回。你可以按 任意顺序 返回答案。
     */
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int[] map = new int[26];
        for (int i = 0; i < map.length; i++) {
            map[i] = 0;
        }
        for (int i = 0; i < words[0].length(); i++) {
            map[words[0].charAt(i)-'a']++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] temp_map = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                temp_map[words[i].charAt(j)-'a']++;
            }
            for (int j = 0; j < map.length; j++) {
                map[j] = Math.min(map[j], temp_map[j]);
            }
        }
        for (int i = 0; i < map.length; i++) {
            while(map[i]>0){
                list.add(String.valueOf((char)(i + 'a')));
                map[i]--;
            }
        }
        return list;
    }
}
