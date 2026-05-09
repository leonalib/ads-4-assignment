public class Experiment {

    public void runTraversals(Graph g, boolean printTraversal) {
        // BFS
        long start = System.nanoTime();
        if (printTraversal) {
            System.out.print("BFS: ");
            g.bfs(0);
            System.out.println();
        }
        else {
            g.bfs(0);
        }
        long end = System.nanoTime();

        System.out.println("BFS time: " + (end - start) + " ns");


        // DFS
        start = System.nanoTime();
        if (printTraversal) {
            System.out.print("DFS: ");
            g.dfs(0);
            System.out.println();
        } else {
            g.dfs(0);
        }
        end = System.nanoTime();

        System.out.println("DFS time: " + (end - start) + " ns");
    }


    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};

        for (int size : sizes) {
            Graph g = new Graph();

            for (int i = 0; i < size; i++) {
                g.addVertex(new Vertex(i));
            }

            for (int i = 0; i < size - 1; i++) {
                g.addEdge(i, i + 1);
            }
            System.out.println("\nGraph size: " + size);

            // print traversal for small graph
            if (size == 10) {
                runTraversals(g, true);
            }
            else {
                runTraversals(g, false);
            }
        }
    }

    public void printResults() {
        System.out.println("\nAnalysis Results:");
        System.out.println("BFS explores level by level.");
        System.out.println("DFS explores deeply before backtracking.");
        System.out.println("Both algorithms have O(V + E) complexity.");
    }
}