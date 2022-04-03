import java.util.Scanner;

class reverseArray {

    public static void printArray(int[] a) {
        for(int i = 0; i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void reverse(int[] A) {
        for(int i = 0; i<A.length; i++){
            for(int j = i+1; j<A.length; j++){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        for(int a = 0; a<arrayLength; a++){
            arr[a] = sc.nextInt();
        }
        //reverse
        reverse(arr);
        //print
        printArray(arr);
        sc.close();        
    }
}