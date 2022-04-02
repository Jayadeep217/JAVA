import java.util.*;

public class Minmaxofarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i = 0; i<=sizeOfArray-1; i++)
        {
            arr[i] = sc.nextInt();
        }
        int min = arr[0], max = arr[0];
        for(int j = 1; j<=arr.length-1;j++)
        {
            if(min > arr[j])
            {
                min = arr[j];
            }
            if (max < arr[j])
            {
                max = arr[j];
            }
        }
        System.out.println(max + " " + min);
        sc.close();
    }
}
