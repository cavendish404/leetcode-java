package g二叉树;

public class V_450_deleteNode {

    /**
     * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，
     * 并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
     * 一般来说，删除节点可分为两个步骤：
     * 首先找到需要删除的节点；
     * 如果找到了，删除它。
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val > key){
            // 去左子树中删除key
            root.left = deleteNode(root.left, key);
        }else if (root.val < key){
            // 去右子树中删除key
            root.right = deleteNode(root.right, key);
        }else {
            // 此结点就是要删除的结点
            if(root.left == null){
                return root.right;
            }else if (root.right == null){
                return root.left;
            }else{
                TreeNode node = new TreeNode();
                node = root.right;
                while(node.left != null){
                    node = node.left;
                }

                node.left = root.left;
                return root.right;
            }
        }
        return root;
    }
}
