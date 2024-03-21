package i贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class k_406reconstructQueue {

    /**
     * 假设有打乱顺序的一群人站成一个队列，数组 people 表示队列中一些人的属性（不一定按顺序）。
     * 每个 people[i] = [hi, ki] 表示第 i 个人的身高为 hi ，前面 正好 有 ki 个身高大于或等于 hi 的人。
     * 请你重新构造并返回输入数组 people 所表示的队列。
     * 返回的队列应该格式化为数组 queue ，其中 queue[j] = [hj, kj] 是队列中第 j 个人的属性（queue[0] 是排在队列前面的人）。
     * @param people
     * @return
     */
    public int[][] reconstructQueue(int[][] people) {
        int n = people.length;
        int[][] result = new int[n][2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[0] == o1[0]){
                    return o2[1] - o1[1];
                }else {
                    return o2[0] - o1[0];
                }
            }
        });
        for (int i = 0; i < n; i++) {
            System.out.println(people[i][0]);
            System.out.println(people[i][1]);
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(list.size() > people[i][1]){
                list.add(people[i][1], people[i]);
            }else {
                list.add(people[i]);
            }
        }

        result = list.toArray(result);

        return result;
    }
}
