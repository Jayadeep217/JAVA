import java.util.*;

public class SeparateOddEvenArray {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int k = 0;k<testCases;k++)
        {
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];
            int evenCount = 0, oddCount = 0;
            for(int i = 0; i<sizeOfArray;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int j = 0; j<arr.length;j++)
            {
                if(arr[j] % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
            int[] evenArr = new int[evenCount];
            int[] oddArr = new int[oddCount];
            int even = 0, odd = 0;
            for(int j = 0; j<arr.length;j++)
            {
                if(arr[j] % 2 == 0)
                {
                    evenArr[even++] = arr[j];
                }
                else
                {
                    oddArr[odd++] = arr[j];
                }
            }
            printArray(oddArr);
            printArray(evenArr);
        }
        sc.close();
    }
}
