import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int occurence = 0;
        int[] arr = new int[sizeOfArray];
        for(int i = 0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        for(int i = 0;i<sizeOfArray;i++){
            if(arr[i] == num){
                occurence++;
            }
            if(occurence == 2){
                System.out.println("The 2nd occurence of " + num + " found at index = " + i);
                break;
            }
        }
        sc.close();
    }
    
}
