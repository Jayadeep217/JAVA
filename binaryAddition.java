import java.util.Scanner;

// This program is for learning purpose only.
// This program takes two binary numbers as input and returns the sum of the two numbers in binary and decimal form.
public class binaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two binary numbers to add! \nFirst number: ");
        String firstBinary = sc.nextLine();
        System.out.println("Decimal of "+ firstBinary + " is " + Integer.parseInt(firstBinary, 2));
        System.out.print("Second number: ");
        String secondBinary = sc.nextLine();
        System.out.println("Decimal of "+ secondBinary + " is " + Integer.parseInt(secondBinary, 2));
        int decimalSum = Integer.parseInt(firstBinary, 2) + Integer.parseInt(secondBinary, 2);        
        String binarySum = Integer.toBinaryString(decimalSum);
        System.out.println("Binary Sum is " + binarySum + " and Decimal Sum is " + decimalSum);
        sc.close();
    }    
}
