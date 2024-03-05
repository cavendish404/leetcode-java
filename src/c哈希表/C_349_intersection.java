package c哈希表;

import java.util.*;

public class C_349_intersection {
    /**
     * 给定两个数组 nums1 和 nums2 ，返回 它们的交集 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
     *
     * @param nums1
     * @param nums2
     * @return
     */

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        Arrays.sort(nums2);
        System.out.println(nums2);
        int i = 0;
        int j = 0;
        Set<Integer> set = new HashSet<>();
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else {
                i++;
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            result[index] = integer;
            index++;
        }
        return result;

    }
    /*
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        return generateIntersection(set1, set2);

    }

    public int[] generateIntersection(Set<Integer> set1, Set<Integer> set2){
        if(set1.size() > set2.size()) {
            return generateIntersection(set2, set1);
        }
        Set<Integer> set3 = new HashSet<>();
        for (Integer i : set1) {
            if(set2.contains(i)){
                set3.add(i);
            }
        }
        int[] result = new int[set3.size()];
        int num = 0;
        for (Integer i : set3) {
            result[num] = i;
            num++;
        }
        return result;
    }

     */
}
