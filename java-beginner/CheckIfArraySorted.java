import java.util.Scanner;

public class CheckIfArraySorted {
    public static boolean isSorted(int[] arr, int n) {
        if(n==0||n==1){
            return true;
        }
        for(int j=1;j<arr.length;j++){
            if(arr[j] < arr[j-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int sizeOfArray = sc.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int i = 0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        if(isSorted(arr, sizeOfArray)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
    
}
