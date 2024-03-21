package i贪心;

public class z_968_minCameraCover {

    /**
     * 给定一个二叉树，我们在树的节点上安装摄像头。
     * 节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
     * 计算监控树的所有节点所需的最小摄像头数量。
     *
     * @param root
     * @return
     */
    int res = 0;
    public int minCameraCover(TreeNode root) {
        if(root == null){
            return 0;
        }
        // 0 没覆盖  1 有摄像头  2 有覆盖
        int val= dfs(root);
        if(val == 0){
            res++;
        }
        return res;
    }

    public int dfs(TreeNode root){
        if(root == null){
            return 2;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if(left == 0 || right == 0){
            res++;
            return 1;
        }else if(left == 1 || right == 1){
            return 2;
        }else if(left == 2 && right == 2){
            return 0;
        }
        return -1;
    }
}

