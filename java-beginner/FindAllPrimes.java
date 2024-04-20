import java.util.*;

public class FindAllPrimes {
    public static ArrayList<Integer> findAllPrimes(int A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=2; i<=A; i++){
            System.out.println("i: "+i);
            int flag = 0;
            for(int j=2; j*j<=i; j++){
                System.out.println("j: "+j);
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                ans.add(i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        System.out.println(findAllPrimes(13));
    }
}