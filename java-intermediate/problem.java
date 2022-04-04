import java.util.Scanner;

public class problem {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int solve(int[] A) {
        int N = A.length;
        int[] psOdd  = new int[N];
        int[] psEven = new int[N];
        int count = 0, sumEven = 0, sumOdd  = 0;
        psEven[0] = A[0];
        for(int i = 1; i < N; i++){
            if(i%2==0){
                psEven[i] = psEven[i-1] + A[i]; 
            }
            else{
                psEven[i] = psEven[i-1];
            }
            if(i%2==1){
                psOdd[i] = psOdd[i-1] + A[i]; 
            }
            else{
                psOdd[i] = psOdd[i-1];
            }
        }
        for(int i = 0; i < N; i++){
            if(i==0){
                sumEven = psOdd[N-1] - psOdd[i];
                sumOdd  = psEven[N-1] - psEven[i];
                if(sumEven == sumOdd){
                    count++;
                }
            }
            else{
                sumEven = psEven[i-1] + psOdd[N-1] - psOdd[i];
                sumOdd  = psOdd[i-1] + psEven[N-1] - psEven[i];
                if(sumEven == sumOdd){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for(int a = 0; a<arrLen; a++){
            arr[a] = sc.nextInt();
        }
        System.out.println(solve(arr));;
        sc.close();
    }
}
