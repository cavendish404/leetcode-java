package i贪心;

public class h_134_canCompleteCircuit {

    /**
     * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
     *
     * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
     *
     * 给定两个整数数组 gas 和 cost ，如果你可以按顺序绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            int costSum = 0;
            int gasSum =0;
            int cnt = 0;
            while(cnt < n){
                int j = (i + cnt) % n;
                gasSum += gas[j];
                costSum += cost[j];
                if(costSum > gasSum){
                    break;
                }
                cnt++;
            }
            if(cnt == n){
                return i;
            }else {
                i = i + cnt;
            }
        }
        return -1;
    }
}
