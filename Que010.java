public class Que010 {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a octal number: ");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String n = sc.nextLine();

            int decimal = Integer.parseInt(n, 8);
            System.out.println("Decimal: " + decimal);

            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid octal number.");
        }
    }

}
