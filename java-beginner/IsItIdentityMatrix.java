public class IsItIdentityMatrix {
    public int solve(final int[][] A) {
        int identity = 1;
        for(int i = 0; i < A.length;i++){
            for(int j=0;j<A[0].length;j++)
            {
                if ( i == j && A[i][j] != 1 )
                {
                    identity = 0;
                }
                if(i != j && A[i][j] != 0)
                {
                    identity = 0;
                }
            }
        }
        return identity;
    }
}
