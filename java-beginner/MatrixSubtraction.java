public class MatrixSubtraction {
    public int[][] solve(int[][] A, int[][] B) {
        int r = A.length;
        int c = A[0].length;
        int[][] subArr = new int[r][c];
        for(int i =0;i<r;i++)
        {
            for(int j =0;j<c;j++)
            {
                subArr[i][j] = A[i][j] - B[i][j];
            }
        }
        return subArr;
    }
}