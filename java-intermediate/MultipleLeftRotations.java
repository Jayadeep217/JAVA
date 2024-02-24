import java.util.Scanner;

class MultipleLeftRotations {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] A, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static int[][] solve(int[] arrA, int[] arrB) {
        int arrALen = arrA.length;
        int arrBLen = arrB.length;
        int[][] ans = new int[arrBLen][arrALen];
        for(int c=0; c<arrBLen; c++){
            int rotations = arrB[c];
            int[] arrAcopy = arrA.clone();
            if(rotations > arrALen){
                rotations = rotations % arrALen;
            }
            reverse(arrAcopy, 0, rotations - 1);
            reverse(arrAcopy, rotations, arrALen - 1);
            reverse(arrAcopy, 0, arrALen - 1);
            ans[c] = arrAcopy;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayALen = sc.nextInt();
        int[] A = new int[arrayALen];
        for(int a = 0; a<arrayALen; a++){
            A[a] = sc.nextInt();
        }
        int arrayBLen = sc.nextInt();
        int[] B = new int[arrayBLen];
        for(int b = 0; b<arrayBLen; b++){
            B[b] = sc.nextInt();
        }
        solve(A, B);
        int[][] ansFinal = solve(A, B);
        printArray(ansFinal[0]);
        printArray(ansFinal[1]);
        sc.close();        
    }
}