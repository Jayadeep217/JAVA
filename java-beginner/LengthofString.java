import java.util.*;

public class LengthofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0;i<t;i++)
        {
            String s = sc.next();
            System.out.println(s.length());
        }
        sc.close();
    }
}