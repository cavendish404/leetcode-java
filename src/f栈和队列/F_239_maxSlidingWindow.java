package f栈和队列;

import java.util.*;

public class F_239_maxSlidingWindow {
    /**
     * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
     * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
     * <p>
     * 返回 滑动窗口中的最大值 。
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
            }
        });
        for (int i = 0; i < k; i++) {
            priorityQueue.offer(new int[]{nums[i], i});
        }
        result[0] = priorityQueue.peek()[0];
        for (int i = k; i < nums.length; i++) {
            priorityQueue.offer(new int[]{nums[i], i});
            while (priorityQueue.peek()[1] <= i - k) {
                priorityQueue.poll();
            }
            result[i - k + 1] = priorityQueue.peek()[0];
        }

        return result;

    }

}
