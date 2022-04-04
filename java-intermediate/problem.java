import java.util.Scanner;

public class problem {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void prefixSumArray(int[] A) {
        int[] psArrE = new int[A.length];
        int[] psArrO = new int[A.length];
        psArrE[0] = A[0];
        for(int p=1; p<A.length; p++){
            if(p%2==0){
                psArrE[p] = psArrE[p-1] + A[p];
            }
            else{
                psArrE[p] = psArrE[p-1];
            }
            if(p%2==1){
                psArrO[p] = psArrO[p-1] + A[p];
            }
            else{
                psArrO[p] = psArrO[p-1];
            }
        }
        printArray(psArrE);
        printArray(psArrO);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int a = 0; a<arrLen; a++){
            arr[a] = sc.nextInt();
        }
        prefixSumArray(arr);
        sc.close();
    }
}
