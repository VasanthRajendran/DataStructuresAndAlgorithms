package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Matrix {

    private int[][] graph;
    int visited[];

    public Matrix(int n) {
        graph = new int[n][n];
        visited = new int[n];
    }


    public void addEdge(int src,int dest) {
        graph[src][dest] = 1;
      //  graph[dest][src] = 1;
    }

    public void printGraph() {
        for(int i=0;i<graph.length;i++) {
            for (int j=0;j<graph[0].length;j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void DFS(int i)
    {
        int j;
        System.out.println(i);
        visited[i]=1;
        for(j=0;j<graph.length;j++)
            if(visited[j] != 1 && graph[i][j]==1)
                DFS(j);
    }


    public void BFS(int i) {

        Queue<Integer> Q = new LinkedList<>();
        Q.offer(i);
        visited[i] = 1;
        while (!Q.isEmpty()) {
            int top = Q.peek();
            Q.poll();
            System.out.println(top);
            for (int j = 0; j < graph.length; ++j) {
                if (graph[top][j] != 0 && (visited[j] != 1)) {
                    Q.offer(j);
                    visited[j] = 1;
                }
            }
        }
    }


    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.addEdge(0,1);
        matrix.addEdge(1,2);
        matrix.printGraph();
       // matrix.DFS(2);
        matrix.BFS(0);
    }
}
