public class AreMatricesSame {
    public int solve(int[][] A, int[][] B) {
        int equal = 1;
        for(int i = 0; i<A.length;i++){
            for(int j = 0; j<A[0].length;j++){
                if(A[i][j] != B[i][j]){
                    equal = 0;
                    break;
                }
            }
        }
        return equal;
    }
}
