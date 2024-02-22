package a数组;

public class E_59_generateMatrix {
    public static void main(String[] args) {
        /*
            给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，
            且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
         */
        int n = 9;
        int[][] res = new int[n][n];
        res = generateMatrix(n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int row = 0, col = 0;
        int circle = 0;
        int count = 1;
        int offset = 1;
        while (circle < n / 2) {
            while (col != n - offset) {
                result[row][col] = count;
                count++;
                col++;
            }
            while (row != n - offset) {
                result[row][col] = count;
                count++;
                row++;
            }
            while (col != offset - 1) {
                result[row][col] = count;
                count++;
                col--;
            }
            while (row != offset - 1) {
                result[row][col] = count;
                count++;
                row--;
            }
            row++;
            col++;
            offset++;
            circle++;
        }
        if (n % 2 == 1)
            result[row][col] = count;

        return result;
    }

}
