class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Array_Bst {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {

        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildBST(nums, left, mid - 1);
        root.right = buildBST(nums, mid + 1, right);

        return root;
    }

    // Inorder Traversal
    public void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Array_Bst obj = new Array_Bst();

        int[] nums = { -10, -3, 0, 5, 9 };

        TreeNode root = obj.sortedArrayToBST(nums);

        System.out.println("Inorder Traversal:");
        obj.inorder(root);
    }
}