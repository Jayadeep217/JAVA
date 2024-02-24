import java.util.Scanner;

public class IsitPalindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String a = sc.next();
            
            StringBuilder sb = new StringBuilder(a);
            String sbRev = sb.reverse().toString();
            if(a.equals(sbRev))
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
            sc.close();
        }
}
