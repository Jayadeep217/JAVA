import java.util.Scanner;

class PickFromBothSides {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void reverse(int[] A, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }

    public static int solve(int[] A, int B ) {
        int ans = 0;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayALen = sc.nextInt();
        int[] A = new int[arrayALen];
        for(int a = 0; a<arrayALen; a++){
            A[a] = sc.nextInt();
        }
        int B = sc.nextInt();
        solve(A, B);
        sc.close();        
    }
}