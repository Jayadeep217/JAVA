import java.util.Scanner;

public class prefixSum {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] pfSum(int[] A) {
        int[] psArr = new int[A.length];
        psArr[0] = A[0];
        for(int p=1; p<A.length; p++){
            psArr[p] = psArr[p-1] + A[p];
        }
        return psArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int a = 0; a<arrLen; a++){
            arr[a] = sc.nextInt();
        }
        int[] prefixSumArr = pfSum(arr);
        printArray(prefixSumArr);
        sc.close();
    }
}
