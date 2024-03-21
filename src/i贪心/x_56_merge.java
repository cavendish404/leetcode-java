package i贪心;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class x_56_merge {

    /**
     * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
     * 请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, ((o1, o2) -> o1[0] - o2[0]));
        res.add(intervals[0]);
        for (int i = 1; i < n; i++) {
            int[] ints = res.get(res.size() - 1);
            if(!(ints[1] < intervals[i][0] || ints[0] > intervals[i][1])){
                res.remove(res.size() - 1);
                int left = Math.min(ints[0], intervals[i][0]);
                int right = Math.max(ints[1], intervals[i][1]);
                res.add(new int[]{left, right});
            }else {
                res.add(intervals[i]);
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}
