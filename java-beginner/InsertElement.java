import java.util.*;

public class InsertElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i <= arr1.length - 1; i++) {
            arr1[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        int val = sc.nextInt();
        int[] arr2 = new int[n + 1];
        // arr[idx-1] = val;
        for (int i = 0; i <= arr2.length - 1; i++) {
            for (int j = 0; j < idx - 1; j++) {
                arr2[j] = arr1[j];
            }
            arr2[idx - 1] = val;
            for (int k = idx; k <= arr2.length - 1; k++) {
                arr2[k] = arr1[k - 1];
            }
        }
        for (int i = 0; i <= arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}
