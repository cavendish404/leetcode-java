package g二叉树;

public class C_226_invertTree {

    /**
     * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        TreeNode p = root;
        if(p != null){
            TreeNode temp = p.left;
            p.left = p.right;
            p.right = temp;
            invertTree(p.left);
            invertTree(p.right);
        }
        return root;
    }
}
