package g二叉树;

import java.util.*;

public class S_501_findMode {
    /**
     * 给你一个含重复值的二叉搜索树（BST）的根节点 root ，找出并返回 BST 中的所有 众数（即，出现频率最高的元素）。
     * 如果树中有不止一个众数，可以按 任意顺序 返回。
     * 假定 BST 满足如下定义：
     * 结点左子树中所含节点的值 小于等于 当前节点的值
     * 结点右子树中所含节点的值 大于等于 当前节点的值
     * 左子树和右子树都是二叉搜索树
     * @param root
     * @return
     */

    int count = 0;
    int maxCount = 0;
    TreeNode pre = null;
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        inOrder(root);
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);

        if(pre == null){
            count = 1;
        }else if (pre.val == root.val){
            count++;
        }
        else {
            count = 1;
        }
        if(count == maxCount){
            list.add(root.val);
        }else if(count > maxCount){
            list.clear();
            list.add(root.val);
            maxCount = count;
        }
        pre = root;

        inOrder(root.right);

    }



}
