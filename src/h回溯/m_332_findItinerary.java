package h回溯;

import java.util.*;

public class m_332_findItinerary {

    /**
     * 给你一份航线列表 tickets ，其中 tickets[i] = [fromi, toi] 表示飞机出发和降落的机场地点。请你对该行程进行重新规划排序。
     * 所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。如果存在多种有效的行程，请你按字典排序返回最小的行程组合。
     * 例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前。
     * 假定所有机票至少存在一种合理的行程。且所有的机票 必须都用一次 且 只能用一次。
     *
     * @param tickets
     * @return
     */
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> path = new ArrayList<>();
        int[] used = new int[301];

        Collections.sort(tickets, (o1, o2)->o1.get(1).compareTo(o2.get(1)));

        path.add("JFK");
        dfs(tickets, path, used);
        return path;
    }

    public boolean dfs(List<List<String>> tickets, List<String> path, int[] used) {
        if (path.size() == tickets.size() + 1) {
            return true;
        }

        for (int i = 0; i < tickets.size(); i++) {
            if (used[i] != 1 && tickets.get(i).get(0).equals(path.get(path.size() - 1))) {
                used[i] = 1;
                path.add(tickets.get(i).get(1));
                if ( dfs(tickets, path, used) ){
                    return true;
                }
                path.remove(path.size() - 1);
                used[i] = 0;
            }
        }
        return false;
    }
}
