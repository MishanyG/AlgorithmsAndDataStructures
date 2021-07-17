package arrays_and_sorting.homework7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(7,8);
        graph.addEdge(1,3);


//        System.out.println(graph.getAdjList(2));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
////        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.pathTo(4));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 2);
        System.out.println(bfp.hasPathTo(4));
        System.out.println(bfp.pathTo(3));
    }
}