class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class InOrderTraversal {
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Creating a binary tree: 1
        //                           / \
        //                          2   3
        //                         /
        //                        4
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        InOrderTraversal solution = new InOrderTraversal();
        solution.inOrderTraversal(root);  // Output: 4 2 1 3
    }
}
