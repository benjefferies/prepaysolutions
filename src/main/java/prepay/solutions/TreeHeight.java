package prepay.solutions;

public class TreeHeight {
    public static int calculateHeight(TreeNode root) {
        return walkTree(root, 0);
    }

    public static int walkTree(TreeNode node, int depth) {
        int leftDeepest = depth;
        int rightDeepest = depth;
        if (node.getLeftChild() != null) {
            leftDeepest = walkTree(node.getLeftChild(), depth + 1);
        }
        if (node.getRightChild() != null) {
            rightDeepest = walkTree(node.getRightChild(), depth + 1);
        }
        return Math.max(leftDeepest, rightDeepest);
    }

    public static void main(String[] args) {
        TreeNode leaf1 = new TreeNode(null, null);
        TreeNode leaf2 = new TreeNode(null, null);
        TreeNode node = new TreeNode(leaf1, null);
        TreeNode root = new TreeNode(node, leaf2);

        System.out.println(TreeHeight.calculateHeight(root));
    }
}