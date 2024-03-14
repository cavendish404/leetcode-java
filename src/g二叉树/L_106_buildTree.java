package g二叉树;

import java.util.HashMap;
import java.util.Map;

public class L_106_buildTree {

    /**
     * 给定两个整数数组 inorder 和 postorder ，
     * 其中 inorder 是二叉树的中序遍历， postorder 是同一棵树的后序遍历，
     * 请你构造并返回这颗 二叉树 。
     *
     * @param inorder
     * @param postorder
     * @return
     */
    Map<Integer, Integer> map = new HashMap<>();
    int[] post;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        post = postorder;
        return build(0, inorder.length - 1, 0, postorder.length - 1);

    }

    public TreeNode build(int in_begin, int in_end, int post_begin, int post_end) {
        if (in_end < in_begin || post_end < post_begin) {
            return null;
        }

        int root_val = post[post_end];
        Integer root_index = map.get(root_val);
        TreeNode node = new TreeNode(root_val);
        node.left = build(in_begin, root_index - 1, post_begin, post_begin + root_index - in_begin - 1);
        node.right = build(root_index + 1, in_end, post_begin + root_index - in_begin, post_end - 1);
        return node;
    }
}
