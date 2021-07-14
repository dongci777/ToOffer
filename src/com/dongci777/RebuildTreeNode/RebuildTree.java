package com.dongci777.RebuildTreeNode;

/**
 * @Author: zxb
 * @Date : 2021/7/14 9:22 下午
 */
public class RebuildTree {

    private TreeNode rebuildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null) {
            return null;
        }
        return buildTree(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int pStart, int pEnd, int iStart, int iEnd) {
        if (pStart > pEnd || iStart > iEnd) {
            return null;
        }

        // new 一个treeNode
        TreeNode root = new TreeNode(preorder[0]);
        root.left = root.right = null;

        if (pStart == pEnd) {
            return root;
        }

        int mid = iStart;
        while (mid <= iEnd && inorder[mid] != root.val) {
            mid++;
        }

        // 找到mid就是根在中序序列中的位置
        int leftCount = mid - iStart;
        // 重建左子树和右子树
        root.left = buildTree(preorder, inorder, pStart + 1, pStart + leftCount, iStart, mid - 1);
        root.right = buildTree(preorder, inorder, pStart + leftCount + 1, pEnd, mid + 1, iEnd);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
    }
}
