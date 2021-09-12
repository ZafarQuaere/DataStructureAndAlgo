package com.example.javapractice.cisco;
/*
Given a sorted array.
Write a function that creates a Balanced Binary Search Tree using array elements.
 */
public class BinaryTree {
    static Node root;

    public static void main(String[] arg) {
        BinaryTree bt = new BinaryTree();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = bt.sortArrayToBst(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        bt.preOrder(root);
    }

    /* A utility function to print preorder traversal of BST */
    private void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private  Node sortArrayToBst(int[] arr, int start, int end) {
        if (start > end)
            return null;

        //get the middle element and make it root
        int mid = (start + end) / 2;
        Node node = new Node(arr[mid]);

        // recursively construct the left subtree and make it left child of root
        node.left = sortArrayToBst(arr, start, mid - 1);

        // recursively construct the right subtree and make it right child of root
        node.right = sortArrayToBst(arr, mid + 1, end);

        return node;
    }

}

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
