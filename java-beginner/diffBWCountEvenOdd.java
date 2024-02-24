import java.util.*;

public class diffBWCountEvenOdd {
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
            for(int i = 0; i<arr.length;i++)
            {
                if(arr[i] % 2 == 0)
                {
                    evenCount++;
                }
                else
                {
                    oddCount++;
                }
            }
            int difference = evenCount - oddCount;
            difference = difference<0 ? -(difference) : difference;
            System.out.println(difference);

        }
        sc.close();
    }
}
