package mirea.ru.lazarev_pavel.kvbo0121.pr30;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void add(int value) {
        root = add(root, value);
    }

    private Node add(Node current, int value) {
        if (current == null) return new Node(value);

        if (value < current.value) {
            current.left = add(current.left, value);
        } else if (value > current.value) {
            current.right = add(current.right, value);
        }

        return current;
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return 0;

        int h1 = 0, h2 = 0;

        if (node.left != null) h1 = height(node.left);
        if (node.right != null) h2 = height(node.right);

        return Math.max(h1, h2) + 1;
    }

    public void reverse() {
        reverse(root);
    }

    private void reverse(Node node) {
        if (node == null) return;

        if (node.left != null && node.right != null) {
            Node temp = node.left;
            node.left = node.right;
            node.right = temp;

            reverse(node.left);
            reverse(node.right);
        } else if (node.left != null) {
            reverse(node.left);
        } else if (node.right != null) {
            reverse(node.right);
        }
    }

    public boolean lookup(int value) {
        return lookup(root, value);
    }

    private boolean lookup(Node node, int value) {
        if (node == null) return false;

        if (value < node.value) return lookup(node.left, value);
        if (value > node.value) return lookup(node.right, value);

        return true;
    }

    public int maxWidth() {
        return maxWidth(root);
    }

    private int maxWidth(Node node) {
        int maxWidth = 0;
        int width = 0;
        int h = height();

        for (int i = 1; i < h; i++) {
            width = width(root, i);
            maxWidth = Math.max(maxWidth, width);
        }

        return maxWidth;
    }

    private int width(Node node, int level) {
        if (node == null) return 0;

        if (level == 0) return 1;

        return width(node.left, level - 1) + width(node.right, level - 1);
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null) return 0;

        return size(node.left) + size(node.right) + 1;
    }

    private boolean compare(Node node, Node other) {
        if (node == null && other == null) return true;
        if (node != null && other != null) {
            return node.value == other.value
                    && compare(node.left, other.left)
                    && compare(node.right, other.right);
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != Tree.class) return false;
        return compare(root, ((Tree) obj).root);
    }
}
