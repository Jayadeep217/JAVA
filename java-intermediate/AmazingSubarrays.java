import java.util.Scanner;

public class AmazingSubarrays {
    public static int solve(String A) {
        int n = A.length();
        int sum = 0;
        for(int i =0;i<n;i++){
            char ch = A.charAt(i);
            if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                sum +=n-i;
                sum%=10003;
            }
        }
        return sum%10003;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        System.out.println(solve(a));
        sc.close();
    }
}
