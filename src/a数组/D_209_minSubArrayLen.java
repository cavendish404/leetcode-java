package a数组;

public class D_209_minSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1};
        int target = 11;
        System.out.println(minSubArrayLen2(target, nums));
    }
    /*
        给定一个含有 n 个正整数的数组和一个正整数 target 。
        找出该数组中满足其总和大于等于 target 的长度最小的 连续子数组
         [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。
         如果不存在符合条件的子数组，返回 0 。
         示例 1：
            输入：target = 7, nums = [2,3,1,2,4,3]
            输出：2
        解释：子数组 [4,3] 是该条件下的长度最小的子数组。
        示例 2：
            输入：target = 4, nums = [1,4,4]
            输出：1
        示例 3：
            输入：target = 11, nums = [1,1,1,1,1,1,1,1]
            输出：0
     */

    public static int minSubArrayLen(int target, int[] nums) {
        // O(n2)
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("i = " + i);
            int sum = nums[i];
            int count = 1;
            if (sum >= target && count < length)
                length = count;
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                count++;
                if (sum >= target && count < length) {
                    length = count;
                    System.out.println(length);
                    break;
                }

            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        // 滑动窗口
        int length = Integer.MAX_VALUE;
        int front = 0, rear = 0;
        int sum = nums[0];
        while (rear < nums.length) {

            if (sum >= target) {
                length = Math.min(length, rear - front + 1);
                sum -= nums[front];
                front++;

            } else {
                rear++;
                if (rear < nums.length)
                    sum += nums[rear];
            }
        }
        return length == Integer.MAX_VALUE ? 0 : length;
    }
}
