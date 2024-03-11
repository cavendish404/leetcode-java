package g二叉树;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个二叉树的根节点 root ，按 任意顺序 ，返回所有从根节点到叶子节点的路径。
 * 叶子节点 是指没有子节点的节点。
 */
public class I_257_binaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        preOrder(root, result, "");
        return result;

    }

    public void preOrder(TreeNode root, List<String> result, String path){

        if(root != null){
            StringBuilder sb = new StringBuilder(path);

            if(root.left == null && root.right == null){
                sb.append(root.val);
                result.add(sb.toString());

            }
            sb.append(root.val);
            sb.append("->");
            preOrder(root.left, result, sb.toString());
            preOrder(root.right, result, sb.toString());
        }
    }
}
