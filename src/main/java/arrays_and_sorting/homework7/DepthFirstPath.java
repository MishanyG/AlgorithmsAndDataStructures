package arrays_and_sorting.homework7;

public class DepthFirstPath {
    public PathTo path = new PathTo();

    public DepthFirstPath(Graph g, int source) {
        path.source = source;
        path.marked = new boolean[g.getVertexCount()];
        path.edgeTo = new int[g.getVertexCount()];
        dfs(g, source);
    }

    private void dfs(Graph g, int v) {
        path.marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!path.marked[w]) {
                path.edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }
}