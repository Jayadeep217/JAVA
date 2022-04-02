import java.util.*;

public class CopyArray {

    public static int[] copyArr(final int[] A, int B) {
        int[] copyA = new int[A.length];

        for(int i = 0; i<copyA.length;i++)
        {
            copyA[i] = A[i] + B;
        }
        return copyA;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray;i++)
        {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int[] cArr = new int[sizeOfArray];
        cArr = copyArr(arr,num);
        for(int j = 0; j<sizeOfArray;j++)
        {
            System.out.print(cArr[j] + " ");
        }
        sc.close();
    }
}
