package g二叉树;

public class E_104_maxDepth {


    /**
     * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
     * @param root
     * @return
     */
//    public int maxDepth(TreeNode root) {
//        int dep = 0;
//        inOrder(root, dep);
//        return dep;
//    }
//
//    public void inOrder(TreeNode root, int depth){
//        if(root != null){
//            depth += 1;
//            System.out.println(depth);
//            inOrder(root.left, depth);
//            inOrder(root.right, depth);
//        }
//
//    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left > right ? left + 1 : right + 1;
    }
}
