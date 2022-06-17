import java.util.Scanner;

public class AmazingSubarrays {
    public static int solve(String A) {
        int res = 0;
        int size = A.length();
        String vowels = "aeiouAEIOU";
        for(int i = 0;i<size;i++){
            if(vowels.contains(String.valueOf(A.charAt(i))))
            res += size - i;
        }
        return res%10003;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(solve(a));
        sc.close();
    }
}
