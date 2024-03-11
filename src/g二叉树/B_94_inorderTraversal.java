package g二叉树;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class B_94_inorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !s.empty()) {
            if(cur != null){
                s.push(cur);
                cur = cur.left;
            }else {
                cur = s.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }

    }

}
