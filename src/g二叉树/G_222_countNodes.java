package g二叉树;

public class G_222_countNodes {
    /**
     * 完全二叉树 的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，
     * 并且最下面一层的节点都集中在该层最左边的若干位置。
     * 若最底层为第 h 层，则该层包含 1~ 2h 个节点。
     * @param root
     * @return
     */

    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = countLevel(root.left);
        int right = countLevel(root.right);

        if(left == right){
            return countNodes(root.right) + (int) Math.pow(2 ,left);
        }else {
            return countNodes(root.left) + (int) Math.pow(2 ,right);
        }


    }

    public int countLevel(TreeNode root){
        int num = 0;
        while(root != null){
            num++;
            root = root.left;
        }
        return num;
    }

}
