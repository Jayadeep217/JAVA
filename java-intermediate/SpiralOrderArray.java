import java.util.Scanner;

public class SpiralOrderArray {
    public static void printArray(int[][] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print("[ ");
            for(int j = 0; j<a[0].length;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("]");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[][] ans = new int[A][A];
        int i = 0, j = 0, num = 1, dir = 0;
        while(num <= A * A){
            ans[i][j] = num;
            num = num + 1;
            if(dir == 0){
                j = j + 1;
                if(j == A || ans[i][j] != 0){
                    dir=1;
                    i = i + 1;
                    j = j - 1;
                }
            }
            else if(dir == 1){
                i = i + 1;
                if(i == A || ans[i][j] != 0){
                    dir = 2;
                    i = i - 1;
                    j = j - 1;
                }
            }
            else if(dir == 2){
                j = j - 1;
                if(j < 0 || ans[i][j] != 0){
                    dir = 3;
                    i = i - 1;
                    j = j + 1;
                }
            }
            else if(dir == 3){
                i = i - 1;
                if(i < 0 || ans[i][j] != 0){
                    dir = 0;
                    i = i + 1;
                    j = j + 1;
                }
            }
        }
        printArray(ans);
        sc.close();
    }
}