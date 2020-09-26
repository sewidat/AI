public class Node<T> implements Comparable<Node> {
    Node rightNode;
    Node leftNode;
    T data;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "rightNode=" + this.rightNode +
                ", leftNode=" + this.leftNode +
                ", data=" + this.data +
                '}';
    }


    @Override
    public int compareTo(Node o) {
        if (o.data.equals(this.data)) {
            return 0;
        } else if (Integer.parseInt(o.data.toString()) < Integer.parseInt(this.data.toString())) {
            return 1;
        } else return -1;
    }
}
