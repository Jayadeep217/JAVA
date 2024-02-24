import java.util.Scanner;

public class SeriesPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int num = 0,count = 1;
        for(int i = 1; count <= N1; i++){
            num = 3 * i + 2;
            if (num % N2 != 0){
                System.out.print(num + " ");
                count++;
            }
        }
        sc.close();
    }
}
