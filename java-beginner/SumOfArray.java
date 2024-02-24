import java.util.*;

public class SumOfArray {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i = 0; i<sizeOfArray;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j =0; j<=arr.length -1;j++)
        {
            sum = sum + arr[j];
        }
        System.out.println(sum);
        sc.close();
    }
    
}
