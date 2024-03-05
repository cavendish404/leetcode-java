package c哈希表;

import java.util.HashSet;
import java.util.Set;

public class D_202_isHappy {
    /**
     * 编写一个算法来判断一个数 n 是不是快乐数。
     * <p>
     * 「快乐数」 定义为：
     * <p>
     * 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
     * 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
     * 如果这个过程 结果为 1，那么这个数就是快乐数。
     * 如果 n 是 快乐数 就返回 true ；不是，则返回 false 。
     */

    // 快慢指针 循环
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getSum(slow);
            fast = getSum(fast);
            fast = getSum(fast);
        }while (slow != fast);
        if(slow == 1){
            return true;
        }else{
            return false;
        }

    }
    /*
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        int temp = n;
        while (true) {
            temp = getSum(temp);
            if (temp == 1){
                return true;
            }
            if (set.contains(temp)) {
                return false;
            } else {
                set.add(temp);
            }

        }
    }
    */
    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        return sum;
    }


}
