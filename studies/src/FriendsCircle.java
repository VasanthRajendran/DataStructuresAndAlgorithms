class FriendsCircle {
    public int findCircleNum(int[][] m) {
        int count=0;
        for(int i=0; i<m.length; i++)
        {
            if(m[i][i]==1)
            {
                count++;
                dfsrecursearch(m, i);
            }
        }
        return count;
    }
    void dfsrecursearch(int[][] m, int rc)
    {
        for(int i=0; i<m.length; i++)
        {
            if(m[i][rc] == 1)
            {
                m[i][rc]=2;
                dfsrecursearch(m, i);
            }
        }
    }


    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
        new FriendsCircle().findCircleNum(arr);
    }
}