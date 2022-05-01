import java.util.Scanner;

class RotationGame {

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        for(int a = 0; a<arrayLength; a++){
            arr[a] = sc.nextInt();
        }
        int rotations = sc.nextInt();
        if(rotations > arrayLength){
            rotations = rotations % arrayLength;
        }
        //reverse
        reverse(arr,0,arrayLength - 1);
        //reverse 0 to k = rotations
        reverse(arr,0,rotations - 1);
        //reverse k to N-K
        reverse(arr,rotations,arrayLength - 1);
        //print
        printArray(arr);
        sc.close();        
    }
}