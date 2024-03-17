package h回溯;

import g二叉树.TreeNode;

import java.security.KeyStore;

public class o_37_solveSudoku {

    /**
     * 编写一个程序，通过填充空格来解决数独问题。
     * 数独的解法需 遵循如下规则：
     * 数字 1-9 在每一行只能出现一次。
     * 数字 1-9 在每一列只能出现一次。
     * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
     * 数独部分空格内已填入了数字，空白格用 '.' 表示。
     * @param board
     */
    public void solveSudoku(char[][] board) {
        char[] nums = new char[]{'1','2','3','4','5','6','7','8','9'};
        dfs(board, nums);
    }

    private boolean dfs(char[][] board, char[] nums) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if(board[row][col] == '.'){
                    for (int k = 0; k < 9; k++) {
                        if(isvilad(board, row, col, nums[k])){
                            board[row][col] = nums[k];
                            if(dfs(board, nums)){
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isvilad(char[][] board, int row, int col, char num) {

        for (int j = 0; j < board.length; j++) {
            if(board[j][col] == num){
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if(board[row][j] == num){
                return false;
            }
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) { // 判断9方格里是否重复
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num ) {
                    return false;
                }
            }
        }
        return true;
    }
}
