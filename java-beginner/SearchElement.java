import java.util.*;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int k = 1;k<=testCase;k++)
        {
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];
            for(int i =0; i<sizeOfArray;i++)
            {
                arr[i] = sc.nextInt();
            }
            int sElement = sc.nextInt();
            int exists = 0;
            for(int j = 0; j<=arr.length -1;j++)
            {
                if(sElement == arr[j])
                {
                    exists = 1;
                }
            }
            if(exists == 1)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
        sc.close();
    }
}
