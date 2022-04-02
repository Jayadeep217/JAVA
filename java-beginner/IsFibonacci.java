import java.util.Scanner;

public class IsFibonacci {

    public static int fib(int a) {
        if(a <=1)
        {
            return a;
        }
        else
        {
            int a1 = 0;
            int a2 = 1;
            int a3 = 0;
            for(int i = 0; i<=a;i++)
            {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
                if (a3 >= a)
                {
                    break;
                }
            }
            return a3;
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        for(int k = 0; k < testCase;k++)
        {
            int num = sc.nextInt();
            int fibNum = fib(num);
            if(num == fibNum)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
