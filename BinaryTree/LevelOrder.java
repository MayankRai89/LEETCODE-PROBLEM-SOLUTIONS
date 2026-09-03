package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static int idx = -1;

    static class BinaryTree {
        public static Node buildTree(int node[]) {
            idx++;
            if (idx >= node.length || node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node current = queue.poll();
                System.out.print(current.data + " ");

                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
        }

        public static void printTree(Node node, String indent, boolean last) {
            if (node != null) {
                System.out.print(indent);
                if (last) {
                    System.out.print("└─");
                    indent += "  ";
                } else {
                    System.out.print("├─");
                    indent += "│ ";
                }
                System.out.println(node.data);

                if (node.left != null || node.right != null) {
                    if (node.left != null) {
                        printTree(node.left, indent, node.right == null);
                    }
                    if (node.right != null) {
                        printTree(node.right, indent, true);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
        System.out.println("=== Tree Structure ===");
        tree.printTree(root, "", true);

        System.out.println("\n\n=== Level Order Traversal (BFS) ===");
        tree.levelOrder(root);
        System.out.println();
    }
}
