import java.util.Scanner;

public class Que008 {

    public static boolean isPositive(int n) {
        if (n > 0)
            return true;
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPositive(n)) {
            System.out.println(n + " is a positive number.");
        } else {
            System.out.println(n + " is not a positive number.");
        }
    }
}
