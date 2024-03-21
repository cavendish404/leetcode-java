package i贪心;

import java.util.HashMap;
import java.util.Map;

public class j_860_lemonadeChange {

    /**
     * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
     * 顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
     * 每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。
     * 你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
     * 注意，一开始你手头没有任何零钱。
     * 给你一个整数数组 bills ，其中 bills[i] 是第 i 位顾客付的账。如果你能给每位顾客正确找零，返回 true ，否则返回 false 。
     *
     * @param bills
     * @return
     */
    public boolean lemonadeChange(int[] bills) {

        int[] money = new int[3];
        int n = bills.length;
        for (int i = 0; i < n; i++) {
            if(bills[i] == 5){
                money[0]++;
            }
            if(bills[i] == 10){
                if(money[0] == 0){
                    return false;
                }
                money[0]--;
                money[1]++;
            }
            if(bills[i] == 20){
                if(money[0] == 0){
                    return false;
                } else if (money[0] < 3 && money[1] == 0) {
                    return false;
                }
                if(money[1] > 0){
                    money[1]--;
                    money[0]--;
                    money[2]++;
                }else {
                    money[0] = money[0] - 3;
                    money[2]++;
                }
            }

        }
        return true;
    }
}
