package arrays_and_sorting.homework7;

import java.util.LinkedList;

public class BreadthFirstPath {
    public PathTo path = new PathTo();

    public BreadthFirstPath(Graph g, int source) {
        path.source = source;
        path.marked = new boolean[g.getVertexCount()];
        path.edgeTo = new int[g.getVertexCount()];
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(source);
        path.marked[source] = true;

        while (!queue.isEmpty()){
            int vertex = queue.removeFirst();
            for (int w : g.getAdjList(vertex)) {
                if(!path.marked[w]){
                    path.marked[w] = true;
                    path.edgeTo[w] = vertex;
                    System.out.println(vertex + " -> " + w);
                    queue.addLast(w);
                }
            }
        }
    }
}