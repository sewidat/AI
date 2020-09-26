import java.util.PriorityQueue;

/*
        All the nodes reachable from the current node are explored
        first (shallow nodes are expanded before deep nodes).
         */
public class BreadthFirstSearch {
    static Tree<Integer> tree = new Tree<>();

    public static void main(String[] args) {


        tree.insert(50);
        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
        tree.insert(80);
        System.out.println("done tree adding");
        tree.traverseInOrder(tree.root);
        System.out.println();
        System.out.println(tree.root.data);
        System.out.println(find(60));

    }

    static PriorityQueue<Node<Integer>> pq = new PriorityQueue<>();
    static Node<Integer> wantedNode;

    private static Node find(int x) {
        method(tree.root, x);
        return wantedNode;
    }

    private static void method(Node root, Integer x) {
        if (root != null) {
            pq.add(root);
            if (pq.peek().data.compareTo(x) == 0) {
                wantedNode = pq.remove();
            } else {
                Node xNode = pq.poll();
                method(xNode.leftNode, x);
                method(xNode.rightNode, x);

            }

        }

    }
}
