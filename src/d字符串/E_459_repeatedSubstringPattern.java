package d字符串;

public class E_459_repeatedSubstringPattern {
    /**
     * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
     *
     * @param s
     * @return
     */
    public boolean repeatedSubstringPattern(String s) {
        // 原串 s1+s2 把原串两份拼在一起变成s1+s2+s1+s2  去头去尾变成s3+s2+s1+s4 如果原串可重复， 则s2必定等于s1 那就会包含原串
        String str = s + s;
        return str.substring(1, str.length() - 1).contains(s);

    }
}
