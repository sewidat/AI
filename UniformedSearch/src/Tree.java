public class Tree<T extends Comparable<T>> {
    Node<T> root;

    public void insert(T value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }

        if (value.compareTo((T) current.data) < 0) {
            current.leftNode = addRecursive(current.leftNode, value);
        } else if (value.compareTo((T) current.data) > 0) {
            current.rightNode = addRecursive(current.rightNode, value);
        } else {
            return current;
        }

        return current;
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.leftNode);
            System.out.print(" " + node.data);
            traverseInOrder(node.rightNode);
        }

    }
}
