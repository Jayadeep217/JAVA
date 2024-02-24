import java.util.Scanner;

public class StarPatternII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int temp = n;
        for(int i =1; i<=n;i++)
        {
            for(int j = 1;j<=temp;j++)
            {
                if(j == temp || j == 1 || i == 1)
                {
                    System.out.print('*');
                }
                else
                {
                    System.out.print(' ');
                }
            }
            temp--;
            System.out.println();
        }
        sc.close();
    }
}
