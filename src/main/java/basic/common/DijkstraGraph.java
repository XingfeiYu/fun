package basic.common;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by xingfeiy on 8/8/16.
 */
public class DijkstraGraph {
    private int num;

    private Vertex[] vertexes;

    public DijkstraGraph(int[] values) {
        this.num = values.length;
        this.vertexes = new Vertex[this.num];
        for(int i = 0; i < this.num; i++) {
            this.vertexes[i] = new Vertex(values[i], i);
        }
    }

    public void addEdge(int vertex, Vertex added) {
        vertexes[vertex].getAdjacency().add(added);
    }

    public void dijkstra(int source) {
        int[] dist = new int[this.num];
        int[] preVertex = new int[this.num];
        for(int i = 0; i < this.num; i++) {
            dist[i] = Integer.MAX_VALUE;
            preVertex[i] = i;
        }
        dist[source] = 0;
        preVertex[source] = -1;
        List<Vertex> vertexList = Arrays.asList(this.vertexes);
        while (!vertexList.isEmpty()) {
            LinkedList<Vertex> adjacency = this.vertexes[source].getAdjacency();
            //todo
        }
    }


    public class Vertex {
        private int index = 0;

        private int value = 0;

        private LinkedList<Vertex> adjacency = new LinkedList();

        public Vertex(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public LinkedList<Vertex> getAdjacency() {
            return adjacency;
        }

        public void setAdjacency(LinkedList<Vertex> adjacency) {
            this.adjacency = adjacency;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Vertex vertex = (Vertex) o;

            return index == vertex.index;

        }

        @Override
        public int hashCode() {
            return index;
        }
    }

    public class SPTResult {
        private int[] dist;

        private int[] preVertex;

        public SPTResult(int num) {
            dist = new int[num];
            preVertex = new int[num];
        }

        public int[] getDist() {
            return dist;
        }

        public void setDist(int[] dist) {
            this.dist = dist;
        }

        public int[] getPreVertex() {
            return preVertex;
        }

        public void setPreVertex(int[] preVertex) {
            this.preVertex = preVertex;
        }
    }



}
