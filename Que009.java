import java.util.Scanner;
import java.io.*;

public class Que009 {

    public static void main(String[] args) {
        try {
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            System.out.println("Octal: " + Integer.toOctalString(n));
            System.out.println("Octal: " + Integer.toHexString(n));
            System.out.println("Octal: " + Integer.toBinaryString(n));

            /*
             * It's important to close the Scanner object when it's no longer needed to
             * release any system resources associated with it and to avoid memory leaks.
             */
            sc.close();

        } catch (Exception e) {
            System.out.println("Please enter a decimal number.");

        }

    }

    // Alternative way to convert decimal to octal, hexa and binary
    /*
     * public static void decToOctal(int n) {
     * int[] octalNum = new int[100];
     * int i = 0;
     * while (n != 0) {
     * octalNum[i] = n % 8;
     * n = n / 8;
     * i++;
     * }
     * }
     * public static void decToHexa(int n) {
     * int[] hexaNum = new int[100];
     * int i = 0;
     * while (n != 0) {
     * hexaNum[i] = n % 8;
     * n = n / 8;
     * i++;
     * }
     * }public static void decToBinary(int n) {
     * int[] binaryNum = new int[100];
     * int i = 0;
     * while (n != 0) {
     * binaryNum[i] = n % 8;
     * n = n / 8;
     * i++;
     * }
     * }
     * 
     * public static void main(String[] args) {
     * try {
     * System.out.println("Enter a number: ");
     * Scanner sc = new Scanner(System.in);
     * int n = sc.nextInt();
     * 
     * decToOctal(n);
     * decToHexa(n);
     * decToBinary(n);
     * 
     * 
     * sc.close();
     * 
     * } catch (Exception e) {
     * System.out.println("Please enter a decimal number.");
     * 
     * }
     * 
     * }
     */

}
