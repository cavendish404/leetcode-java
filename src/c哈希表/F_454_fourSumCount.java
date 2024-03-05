package c哈希表;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class F_454_fourSumCount {
    /**
     * 给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
     * <p>
     * 0 <= i, j, k, l < n
     * nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
     *
     * @param nums1
     * @param nums2
     * @param nums3
     * @param nums4
     * @return
     */
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer, Integer> map12 = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int i1 = 0; i1 < nums2.length; i1++) {
                if (map12.containsKey(nums1[i] + nums2[i1])) {
                    map12.put(nums1[i] + nums2[i1], map12.get(nums1[i] + nums2[i1]) + 1);
                } else {
                    map12.put(nums1[i] + nums2[i1], 1);
                }
            }
        }

        for (int i = 0; i < nums3.length; i++) {
            for (int i1 = 0; i1 < nums4.length; i1++) {
                if (map12.containsKey(0 - nums3[i] - nums4[i1])) {
                    count += map12.get(0 - nums3[i] - nums4[i1]);
                }
            }
        }
        return count;

    }
}
