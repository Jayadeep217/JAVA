import java.util.Scanner;

public class InvertedNumericPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp = n;
        for(int i =1; i<=n;i++)
        {
            for(int j = 1;j<=temp;j++)
            {
                if(j == temp)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(j + " ");
                }
            }
            temp--;
            System.out.println();
        }
        sc.close();
    }
}
