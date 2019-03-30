package Graph;

public class Matrix {

    private int[][] graph;

    public Matrix(int n) {
        graph = new int[n][n];
    }


    public void addEdge(int src,int dest) {
        graph[src][dest] = 1;
        graph[dest][src] = 1;
    }

    public void printGraph() {
        for(int i=0;i<graph.length;i++) {
            for (int j=0;j<graph[0].length;j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Matrix matrix = new Matrix(3);
        matrix.addEdge(0,1);
        matrix.addEdge(1,2);
        matrix.printGraph();
    }
}
