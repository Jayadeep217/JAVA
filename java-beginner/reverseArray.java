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
        System.out.println("***********TWO LOOPS*********");
        int count = 0;
        for(int i = 0; i<A.length; i++){
            for(int j = i+1; j<A.length; j++){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                count++;
            }
        }
        System.out.println("Count : " + count);
    }
    
    // public static void reverseW(int[] A) {
    //     System.out.println("***********ONE LOOP*********");
    //     int i = 0, count1 = 0;
    //     int j = A.length-1;
    //     while(i<j){
    //         int temp = A[i];
    //         A[i] = A[j];
    //         A[j] = temp;
    //         i++;
    //         j--;
    //         count1++;
    //     }
    //     System.out.println("Count : " + count1);
    // }

    public static void reverseW(int[] A) {
        System.out.println("***********ONE LOOP*********");
        int count1 = 0;
        for(int i = 0,j = A.length-1;i<j;i++,j--){
            A[i] = A[i] + A[j]; 
            A[j] = A[i] - A[j];
            A[i] = A[i] - A[j];
            count1++;
        }
        System.out.println("Count : " + count1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        int[] arr2 = new int[arrayLength];
        for(int a = 0; a<arrayLength; a++){
            arr[a] = sc.nextInt();
            arr2[a] = arr[a];
        }
        //reverse
        reverse(arr);
        reverseW(arr2);
        //print
        printArray(arr);
        printArray(arr2);
        sc.close();        
    }
}