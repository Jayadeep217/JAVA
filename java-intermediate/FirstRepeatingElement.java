
import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatingElement {
    public static int solve(int[] A) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < A.length; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i]) + 1);
            }
            else{
                hm.put(A[i], 1);
            }
        }
        for(int i = 0; i < A.length; i++){
            if(hm.get(A[i]) > 1){
                return A[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayALen = sc.nextInt();
        int[] A = new int[arrayALen];
        for(int a = 0; a<arrayALen; a++){
            A[a] = sc.nextInt();
        }
        System.out.println(solve(A));
        sc.close();        
    }
}
