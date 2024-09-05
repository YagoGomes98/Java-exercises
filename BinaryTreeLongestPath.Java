public class BinaryTreeLongestPath {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }

    static class Result {
        int length;
    }

    public static int findLongestPath(TreeNode root, Result result) {
        if (root == null) return 0;
        int left = findLongestPath(root.left, result);
        int right = findLongestPath(root.right, result);
        result.length = Math.max(result.length, left + right);
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        Result result = new Result();
        findLongestPath(root, result);
        System.out.println("Longest path length: " + result.length);
    }
}
