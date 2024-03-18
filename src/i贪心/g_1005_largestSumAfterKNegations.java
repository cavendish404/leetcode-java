package i贪心;

import java.util.Arrays;
import java.util.PriorityQueue;

public class g_1005_largestSumAfterKNegations {

    /**
     * 给你一个整数数组 nums 和一个整数 k ，按以下方法修改该数组：
     * 选择某个下标 i 并将 nums[i] 替换为 -nums[i] 。
     * 重复这个过程恰好 k 次。可以多次选择同一个下标 i 。
     *
     * 以这种方式修改数组后，返回数组 可能的最大和 。
     * @param nums
     * @param k
     * @return
     */
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        PriorityQueue<Integer> dui = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            dui.add(nums[i]);
        }
        while (k > 0){
            Integer peek = dui.peek();
            peek = -peek;
            dui.poll();
            dui.add(peek);
            k--;
        }
        for (Integer i : dui) {
            sum += i;
        }
        return sum;
    }
}
