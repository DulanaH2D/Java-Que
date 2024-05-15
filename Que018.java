import java.util.Scanner;

public class Que018 {

    public static void division(int dividend, int divisor) {
        int result = 0;
        int remainder = 0;
        if (dividend > divisor) {
            result = dividend / divisor;
            remainder = dividend % divisor;
        } else {
            System.out.println("Dividend should be greater than divisor.");
        }
        System.out.println("Result: " + result);
        System.out.println("Remainder: " + remainder);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        division(dividend, divisor);

        sc.close();
    }

}
