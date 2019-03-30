public class Sparse {
    public int[][] multiply(int[][] A, int[][] B) {
        int m = A.length, n = A[0].length, nB = B[0].length;
        int[][] C = new int[m][nB];

        for(int i = 0; i < m; i++) {
            for(int k = 0; k < n; k++) {
                if (A[i][k] != 0) {
                    for (int j = 0; j < nB; j++) {
                        if (B[k][j] != 0) C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Sparse s = new Sparse();
        int array [][] = new int[][]{{1,0,0},{-1,0, 0}};
        int arrayB [][] = new int[][]{{7,0,0},{0,0,0},{0,0,1}};
        s.multiply(array,arrayB);
    }
}