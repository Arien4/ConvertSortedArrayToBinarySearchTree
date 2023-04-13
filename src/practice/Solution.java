package practice;


public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);

    }

    private TreeNode createBST(int[] nums, int begin, int end) {
        if (begin > end) return null;
        int mid = (begin + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createBST(nums, begin, mid - 1);
        root.right = createBST(nums, mid + 1, end);
        return root;
    }


}
