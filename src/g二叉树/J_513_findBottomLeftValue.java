package g二叉树;

import java.util.Comparator;
import java.util.PriorityQueue;

public class J_513_findBottomLeftValue {

    /**
     *给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
     * 意思是 最下面的最左的节点 ！！！如果最下面一层只有一个结点就算是右孩子也没关系
     * 假设二叉树中至少有一个节点。
     * @param root
     * @return
     */
    int max = Integer.MIN_VALUE;
    int result = 0;
    public int findBottomLeftValue(TreeNode root) {

        find(root, 1);
        return result;
    }

    public void find(TreeNode root, int height){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            if(height > max){
                result = root.val;
                max = height;
            }
        }
        if(root.left != null){
            find(root.left, height+1);
        }
        if(root.right != null){
            find(root.right, height+1);
        }

    }
}
