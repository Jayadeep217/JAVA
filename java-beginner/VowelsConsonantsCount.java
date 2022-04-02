import java.util.Scanner;

public class VowelsConsonantsCount {
    public int[] solve(String A) {
        int[] count = new int[2];
        for(int i = 0; i<A.length();i++){
            if(A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' )
            {
                count[0]++;
            }
            else
            {
                count[1]++;
            }   
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        sc.close();
    }   
}
