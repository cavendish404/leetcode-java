package f栈和队列;

public class D_1047_removeDuplicates {
    /**
     * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
     *
     * 在 S 上反复执行重复项删除操作，直到无法继续删除。
     *
     * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
     *
     * @param s
     * @return
     */
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            if(top >= 0 && sb.charAt(top) == s.charAt(i)){
                sb.deleteCharAt(top);
                top--;
            }else {
                sb.append(s.charAt(i));
                top++;
            }
        }
        return sb.toString();
    }
}
