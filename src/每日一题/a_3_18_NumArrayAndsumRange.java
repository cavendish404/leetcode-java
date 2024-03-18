package 每日一题;

public class a_3_18_NumArrayAndsumRange {

    /**
     * 计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right
     * 实现 NumArray 类：
     * <p>
     * NumArray(int[] nums) 使用数组 nums 初始化对象
     * int sumRange(int i, int j) 返回数组 nums 中索引 left 和 right 之间的元素的 总和 ，
     * 包含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] )
     *
     * @param nums
     */

    int[] s;

    public a_3_18_NumArrayAndsumRange(int[] nums) {
        s = new int[nums.length];
        s[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            s[i] = s[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return s[right];
        }
        return s[right] - s[left - 1];
    }
}
