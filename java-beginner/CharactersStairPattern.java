import java.util.*;

public class CharactersStairPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char c = 'A';
        for (int i = 0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if (j == i)
                {
                    System.out.print(c);
                }
                else
                {
                    System.out.print(c + " ");
                }
            }
            c++;
            System.out.println();
        }
        sc.close();        
    }
}