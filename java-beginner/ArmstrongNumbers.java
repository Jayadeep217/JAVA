import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int j = 1; j<=num; j++){
            int num2 = j;
            int sum = 0, lastDigit = 0;
            while(num2 !=0){
                lastDigit = num2 % 10;
                sum = sum + (lastDigit * lastDigit * lastDigit);
                num2 = num2 / 10;
            }
    
            if( sum == j ){
                System.out.println(sum);
            }
        }
        sc.close();
    }    
}
