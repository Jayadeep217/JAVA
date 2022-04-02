import java.util.Scanner;

public class DiffBtwMaxOfEvenMinOfOdd {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        int evenSize = 0, oddSize = 0;
        for(int i = 0; i<sizeOfArray;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<sizeOfArray;i++)
        {
            if(arr[i] % 2 == 0)
            {
                evenSize++;
            }
            else
            {
                oddSize++;
            }
        }
        int[] evenArr = new int[evenSize];
        int[] oddArr = new int[oddSize];
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
        printArray(evenArr);
        printArray(oddArr);
        int minOfOdd = oddArr[0], maxOfEven = evenArr[0];
        for(int j = 0; j<oddArr.length;j++)
        {
            if(minOfOdd > oddArr[j])
            {
                minOfOdd = oddArr[j];
            }
        }
        for(int k = 0; k<evenArr.length;k++)
        {
                
            if (maxOfEven < evenArr[k])
            {
                maxOfEven = evenArr[k];
            }
        }
        System.out.println("maxOfEven : " + maxOfEven);
        System.out.println("minOfOdd : " + minOfOdd);
        System.out.println(maxOfEven - minOfOdd);
        sc.close();
    }
}
