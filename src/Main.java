public class Main {

    public static void main(String[] args) {

        testGraph(10, true);    // Small graph
        testGraph(30, false);   // Medium graph
        testGraph(100, false);  // Large graph
    }

    private static void testGraph(int size, boolean showTraversal) {

        Graph graph = new Graph();

        // Add vertices
        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }

        // Add edges
        for (int i = 0; i < size - 1; i++) {
            graph.addEdge(i, i + 1);
        }

        System.out.println("\nGraph Size: " + size);

        // BFS Traversal
        long startTime = System.nanoTime();

        if (showTraversal) {
            System.out.print("BFS Traversal: ");
            graph.bfs(0);
            System.out.println();
        } else {
            graph.bfs(0);
        }

        long endTime = System.nanoTime();

        System.out.println("BFS Execution Time: "
                + (endTime - startTime) + " ns");


        // DFS Traversal
        startTime = System.nanoTime();

        if (showTraversal) {
            System.out.print("DFS Traversal: ");
            graph.dfs(0);
            System.out.println();
        } else {
            graph.dfs(0);
        }

        endTime = System.nanoTime();

        System.out.println("DFS Execution Time: "
                + (endTime - startTime) + " ns");
    }
}