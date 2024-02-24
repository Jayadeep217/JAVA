import java.util.Scanner;

public class FullNumericPyramid {   
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		//int num = 1;
		for(int i = 1;i<=n;i++)
		{
			//zeros
			for(int j = 1;j<=n-i;j++)
			{
				System.out.print(0 + " ");
			}
			//num
			int num = i;
			for(int k = 1;k<=i;k++)
			{
				System.out.print(num + " ");
				num++;
			}

			num = num -2;
			for(int a = 1;a<=i-1;a++)
			{
				System.out.print(num + " ");
				num--;
			}

			for(int b = 1;b<=n-i;b++)
			{
				System.out.print(0 + " ");
			}
			System.out.println();
		}
        sc.close();
    }
}
