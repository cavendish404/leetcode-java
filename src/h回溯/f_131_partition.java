package h回溯;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class f_131_partition {

    /**
     * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串
     * 返回 s 所有可能的分割方案。
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        dfs(s, 0, path, result);
        return  result;
    }

    public void dfs(String s, int begin, List<String> path, List<List<String>> result){
        if(begin == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < s.length(); i++) {
            if(isHuiWen(s, begin, i)){
                path.add(s.substring(begin, i + 1));
                dfs(s,i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isHuiWen(String str, int left, int right){
        while(left <= right){
            if(!(str.charAt(left) == str.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
