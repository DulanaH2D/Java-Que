import java.util.Scanner;

public class Que012 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a hexadecimal number: ");
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();

            int decimal = Integer.parseInt(n, 16);
            System.out.println("Decimal: " + decimal);

            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid hexadecimal number.");
        }
    }
}
