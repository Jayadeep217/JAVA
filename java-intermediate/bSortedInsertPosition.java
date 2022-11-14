import java.util.Scanner;

public class bSortedInsertPosition {
    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int searchInsert(int[] A, int B) {
        int s = 0, e = A.length - 1;
        while(s <= e){
            int mid = (s + e)/2;
            if(A[mid] == B){
                return mid;
            }
            else if(A[mid] < B){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayALen = sc.nextInt();
        int[] A = new int[arrayALen];
        for(int a = 0; a<arrayALen; a++){
            A[a] = sc.nextInt();
        }
        int B = sc.nextInt();      
        System.out.println(searchInsert(A,B));
        sc.close();        
    }
}
