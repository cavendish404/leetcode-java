package a数组;

public class B_27_removeElement {
    public static void main(String[] args) {
        int[] nums = {1};
        int val = 1;
        int num0 = removeElement(nums, val);
        System.out.println(num0);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    /*
        给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
        不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
        元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
        示例 1：
            输入：nums = [3,2,2,3], val = 3
            输出：2, nums = [2,2]
        示例 2：
            输入：nums = [0,1,2,2,3,0,4,2], val = 2
            输出：5, nums = [0,1,3,0,4]
     */
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;

            }else{
                i++;
            }
        }
        return i;
    }


}
