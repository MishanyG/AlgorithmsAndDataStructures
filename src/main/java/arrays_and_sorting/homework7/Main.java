package arrays_and_sorting.homework7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(3,4);
//        graph.addEdge(7,8);
//        graph.addEdge(1,3);

        graph.addEdge(0, 7);
        graph.addEdge(4, 7);
        graph.addEdge(4, 8);
        graph.addEdge(8, 5);
        graph.addEdge(1, 5);
        graph.addEdge(1, 2);
        graph.addEdge(6, 2);
        graph.addEdge(6, 3);
        graph.addEdge(5, 6);
        graph.addEdge(9, 7);
        System.out.println("Граф состоит из " + graph.getVertexCount() + " вершин.");

//        System.out.println(graph.getAdjList(2));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.path.hasPathTo(4));
////        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.path.pathTo(4));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 8);
//        System.out.println(bfp.path.hasPathTo(4));
        System.out.println(bfp.path.source + "\n|");
        for (Integer b : bfp.path.pathTo(3)) {
            System.out.println(b + "\n|");
        }
        System.out.println("END!");
    }
}