package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class printBinarytree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int idx = -1;

    static class BinaryTree {
        public static Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        // Preorder Traversal: Node -> Left -> Right
        public static void preorder(Node node) {
            if (node == null) {
                return;
            }
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        // Inorder Traversal: Left -> Node -> Right
        public static void inorder(Node node) {
            if (node == null) {
                return;
            }
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }

        // Postorder Traversal: Left -> Right -> Node
        public static void postorder(Node node) {
            if (node == null) {
                return;
            }
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }

        // Level Order Traversal (BFS)
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

        // Print tree structure
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
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println("=== Tree Structure ===");
        tree.printTree(root, "", true);

        System.out.println("\n=== Preorder Traversal (Node -> Left -> Right) ===");
        tree.preorder(root);

        System.out.println("\n\n=== Inorder Traversal (Left -> Node -> Right) ===");
        tree.inorder(root);

        System.out.println("\n\n=== Postorder Traversal (Left -> Right -> Node) ===");
        tree.postorder(root);

        System.out.println("\n\n=== Level Order Traversal (BFS) ===");
        tree.levelOrder(root);
        System.out.println();
    }
}
