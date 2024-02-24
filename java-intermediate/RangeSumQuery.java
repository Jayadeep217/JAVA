import java.util.Scanner;

public class RangeSumQuery {
    public static void printArray(long[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        long[] psArr = new long[A.length];
        psArr[0] = A[0];
        for(int p=1;p<A.length;p++){
            psArr[p] = psArr[p-1] + A[p];
        }
        long[] c = new long[B.length];
        for(int i = 0; i<B.length; i++){
            if(B[i][0] > 1){
                c[i] = psArr[B[i][1] - 1] - psArr[B[i][0] - 2];
            }
            else if(B[i][1] == A.length){
                c[i] = psArr[B[i][1] - 1];
            }
            else if(B[i][0] == 1){
                c[i] = psArr[B[i][1] - 1];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayALen = sc.nextInt();
        int[] A = new int[arrayALen];
        for(int a = 0; a<arrayALen; a++){
            A[a] = sc.nextInt();
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] B = new int[r][c];
        for(int b = 0; b<r;b++){
            for(int d = 0; d < c; d++){
                B[b][d] = sc.nextInt();
            }
        }
        long[] ans = rangeSum(A,B);
        printArray(ans);
        sc.close();
    }
}
