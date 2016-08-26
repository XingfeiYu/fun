package basic.common;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xingfeiy on 8/8/16.
 * 1. How to construct a graph? How to add an edge?
 * 2. BFS && DFS
 * 3. Find a vertex.
 * 4. Insert a vertex or delete a vertex.
 */
public class Graph {
    /**
     * What is graph?
     * 1. Graph is an abstract data type, which means to implement the undirected graph or directed graph.
     * 2. A graph consists of finite vertices.
     */

    private LinkedList<Integer>[] adjacency;

    private int vertices = 0;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency = new LinkedList[this.vertices];
        for(int i = 0; i < this.vertices; i++) {
            this.adjacency[i] = new LinkedList<>();
        }
    }

    public void addEdge(int vertex, int added) {
        if(vertex >= this.vertices) {
            return;
        }
        this.adjacency[vertex].add(added);
    }

    /**
     * Usually, we use queue to implement breadth first traversal.
     * @param startVertex
     */
    public void printBFS(int startVertex) {
        if(this.adjacency == null) {
            return;
        }
        //what's the default initial value in the boolean array?
        boolean[] visited = new boolean[this.vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);
        while (queue.size() != 0) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            Iterator<Integer> iterator = this.adjacency[vertex].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if(visited[next]) {
                    continue;
                }
                queue.add(next);
                visited[next] = true;
            }
        }
    }

    public void printDFS(int startVertex) {
        boolean[] visited = new boolean[this.vertices];
        printDFS(startVertex, visited);
    }

    private void printDFS(int startVertex, boolean[] visited) {
        if(startVertex < 0) {
            return;
        }
        System.out.print(startVertex + " ");
        visited[startVertex] = true;
        for(int vertex : this.adjacency[startVertex]) {
            if(visited[vertex]) {
                continue;
            }
            printDFS(vertex, visited);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.printDFS(2);
        System.out.println();
        g.printBFS(2);
    }
}
