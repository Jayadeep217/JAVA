import java.util.Scanner;

public class prefixSum {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }


    public static void pfSum(int[] A, int startIndex, int endIndex) {
        int[] prefixSumArr = prefixSumArray(A);
        System.out.println("Prefix Sum Array :");
        printArray(prefixSumArr);
        int sum = prefixSumArr[endIndex] - prefixSumArr[startIndex - 1];
        System.out.println("Sum Of all Elements from " + startIndex + " to " + endIndex);
        System.out.println(sum);
    }

    public static int[] prefixSumArray(int[] A) {
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
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();
        pfSum(arr,startIndex,endIndex);
        sc.close();
    }
}
