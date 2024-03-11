package g二叉树;

import java.util.ArrayList;
import java.util.List;

public class A_94_inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return  result;
    }

    public void inorder(TreeNode root, List<Integer> list){
        if(root != null){


            inorder(root.left, list);

            inorder(root.right, list);

            list.add(root.val);
        }
    }

}
