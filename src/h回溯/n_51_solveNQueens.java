package h回溯;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class n_51_solveNQueens {

    /**
     * 按照国际象棋的规则，皇后可以攻击与之处在同一行或同一列或同一斜线上的棋子。
     * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
     * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
     * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
     * @param n
     * @return
     */
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] chessboard = new char[n][n];
        for (char[] chars : chessboard) {
            Arrays.fill(chars, '.');
        }
        dfs(n, 0, chessboard, result);
        return result;
    }

    public void dfs(int n, int row, char[][] chessboard, List<List<String>> result){
        if(row == n){
            result.add(toList(chessboard));
            return;
        }

        for (int col = 0; col < n; col++) {
            if(isVaild(n, row, col, chessboard)){
                chessboard[row][col] = 'Q';
                dfs(n, row + 1, chessboard, result);
                chessboard[row][col] = '.';
            }
        }
    }

    private List<String> toList(char[][] chessboard) {

        List<String> result = new ArrayList<>();
        for (char[] chars : chessboard) {
            StringBuilder sb = new StringBuilder();
            for (char aChar : chars) {
                sb.append(aChar);
            }
            result.add(sb.toString());
        }
        return result;
    }

    private boolean isVaild(int n, int row, int col, char[][] chessboard) {
        // 判断行列以及对角线是否已经有'Q'
        for (int i = 0; i < n; i++) {
            if(chessboard[i][col] == 'Q'){
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            if(chessboard[row][i] == 'Q'){
                return false;
            }
        }
        for (int i = row-1, j = col-1; i >=0 && j >= 0; i--, j--) {
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        for (int i = row-1, j = col+1; i >=0 && j < n; i--, j++) {
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}
