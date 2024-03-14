package h回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class c_17_letterCombinations {
    /**
     * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
     * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
     * @param digits
     * @return
     */
    public List<String> letterCombinations(String digits) {
        List<String> phone = new ArrayList<>(Arrays.asList("abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
        List<Integer> digitList = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
            int num = digits.charAt(i) - '0';
            digitList.add(num);
        }
        List<String> result = new ArrayList<>();
        dfs(digitList, phone, 0, "", result);
        return result;
    }

    public void dfs(List<Integer> digitList, List<String> phone, int begin, String path, List<String> result){
        if(digitList == null || digitList.size() == 0){
            return;
        }
        if(path.length() == digitList.size()){
            result.add(new String(path));
            System.out.println(path);
            return;
        }
        if(begin >= digitList.size()){
            return;
        }
        int index = digitList.get(begin) - 2;
        for (int j = 0; j < phone.get(index).length() ; j++) {
            StringBuilder sb = new StringBuilder(path);
            sb.append(phone.get(index).charAt(j));
            dfs(digitList, phone, begin + 1, sb.toString(), result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
