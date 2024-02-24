import java.util.*;

public class NegativeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
