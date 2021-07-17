package arrays_and_sorting.homework7;

import java.util.LinkedList;

public class PathTo {
    public boolean[] marked;
    public int[] edgeTo;
    public int source;

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public LinkedList <Integer> pathTo(int v) {
        if (!hasPathTo(v)) {
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = v;
        while (vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        return stack;
    }
}