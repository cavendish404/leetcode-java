package i贪心;

import java.util.Arrays;
import java.util.Comparator;

public class v_435_eraseOverlapIntervals {

    /**
     * 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。
     * 返回 需要移除区间的最小数量，使剩余区间互不重叠 。
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int del = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
            }
        });

        int i = 0;
        while (i < n){
            int j = i + 1;
            while (j < n && intervals[i][1] > intervals[j][0]){
                del++;
                j++;
            }
            i = j;
        }
        return del;
    }
}
