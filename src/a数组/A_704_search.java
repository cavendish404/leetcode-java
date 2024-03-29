package a数组;

import javax.naming.directory.SearchControls;

public class A_704_search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int tag = search(nums, target);
        System.out.println(tag);

    }

    /*
        给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
        写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
        示例 1:
        输入: nums = [-1,0,3,5,9,12], target = 9
        输出: 4
        解释: 9 出现在 nums 中并且下标为 4

        示例 2:
        输入: nums = [-1,0,3,5,9,12], target = 2
        输出: -1
        解释: 2 不存在 nums 中因此返回 -1

        提示：
            你可以假设 nums 中的所有元素是不重复的。
            n 将在 [1, 10000]之间。
            nums 的每个元素都将在 [-9999, 9999]之间。
     */
    public static int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int low, int high) {
        int i = low, j = high;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                j = mid - 1;
                binarySearch(nums, target, i, j);
            } else {
                i = mid + 1;
                binarySearch(nums, target, i, j);
            }
        }
        return -1;
    }
}
