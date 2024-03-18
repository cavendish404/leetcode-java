package i贪心;

public class f_45_jump {

    /**
     * 给定一个长度为 n 的 0 索引整数数组 nums。初始位置为 nums[0]。
     * 每个元素 nums[i] 表示从索引 i 向前跳转的最大长度。换句话说，如果你在 nums[i] 处，你可以跳转到任意 nums[i + j] 处:
     * 0 <= j <= nums[i]
     * i + j < n
     * 返回到达 nums[n - 1] 的最小跳跃次数。生成的测试用例可以到达 nums[n - 1]。
     *
     * @param nums
     * @return
     */
    public int jump(int[] nums) {
        int cover = 0;
        int begin = 0;

        int step = 0;

        while(cover < nums.length - 1){
            int maxStep = 0;
            for (int i = begin; i <= cover; i++) {
                maxStep = maxStep > i + nums[i] ? maxStep : i + nums[i];
            }

            begin = cover + 1;
            cover = maxStep;
            step++;
        }
        return step;
    }
}
