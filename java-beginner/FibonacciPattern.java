import java.util.Scanner;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A0 = 0;
        int A1 = 1;
        for(int i = 0;i<N;i++){
            for (int j = 0; j<=i;j++){
                System.out.print(A0 + " ");
                int A2 = A0 + A1;
                A0 = A1;
                A1 = A2;
            }
            System.out.println();
        }
        sc.close();
    }
}
