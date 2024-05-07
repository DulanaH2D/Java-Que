import java.util.Scanner;

public class Que006 {

    public static boolean isSquare(double num) {
        if (num > 0) {
            double x = Math.sqrt(num);
            if (num == x * x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner myObj = new Scanner(System.in);
        double n = myObj.nextDouble();

        if (isSquare(n))
            System.out.print("The number "
                    + "is a square number");
        else
            System.out.print("The number"
                    + " is NOT a square number");
    }

}
