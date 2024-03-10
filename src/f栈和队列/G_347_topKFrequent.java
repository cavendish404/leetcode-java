package f栈和队列;

import java.util.*;

public class G_347_topKFrequent {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，
     * 请你返回其中出现频率前 k 高的元素。
     * 你可以按 任意顺序 返回答案。
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            priorityQueue.offer(new int[]{key, value});
        }
        System.out.println(priorityQueue);
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.peek()[0];
            priorityQueue.poll();
        }
        return result;
    }
}
