import java.util.HashMap;
import java.util.Scanner;

public class ShaggyAndDistances {
    public static int solve(int[] A) {
        int n = A.length;
        int ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> ans_hm = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.get(A[i]) + 1);
            }
            else{
                hm.put(A[i], 1);
            }
        }
        for(int i = 0; i < A.length; i++){
            if(hm.get(A[i]) > 1){
                if(ans_hm.containsKey(A[i])){
                    ans_hm.put(A[i], Math.abs(ans_hm.get(A[i]) - i));
                }
                else{
                    ans_hm.put(A[i], i);
                }
            }
        }
        if(ans_hm.keySet().size() >= 1){
            for(int key : ans_hm.keySet()){
                ans = Math.min(ans, ans_hm.get(key));
            }    
        }
        else{
            ans = 0;
        }
        return ans>0?ans:-1;
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
