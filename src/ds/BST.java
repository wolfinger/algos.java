package io.wolfinger.algos.ds;

public class BST {
    public static BSTNode search(BSTNode node, int value) {
        if ((node == null) || (node.data == value)) {
            return node;
        } else if (value < node.data) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    public static BSTNode insert(BSTNode node, int value) {
        if (value < node.data) {
            if (node.left == null) {
                node.left = new BSTNode(value);
                return node.left;
            } else {
                return insert(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new BSTNode(value);
                return node.right;
            } else {
                return insert(node.right, value);
            }
        }
    }

    private static BSTNode lift(BSTNode node, BSTNode delNode) {
        if (node.left != null) {
            node.left = lift(node.left, delNode);
            return node;
        } else {
            delNode.data = node.data;
            return node.right;
        }
    }

    public static BSTNode delete(BSTNode node, int value) {
        if (node == null) {
            return null;
        } else if (value < node.data) {
            node.left = delete(node.left, value);
            return node;
        } else if (value > node.data) {
            node.right = delete(node.right, value);
            return node;
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                node.right = lift(node.right, node);
                return node;
            }
        }
    }
}
