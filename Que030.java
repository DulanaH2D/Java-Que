import java.util.*;

public class Que030 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array
        Arrays.sort(numbers);

        System.out.println("Sorted numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Using Bubble Sort
    /*
     * public static void main(String[] args) {
     * 
     * Scanner scanner = new Scanner(System.in);
     * 
     * System.out.print("Enter the number of elements: ");
     * int n = scanner.nextInt();
     * 
     * int[] numbers = new int[n];
     * 
     * System.out.println("Enter the numbers:");
     * for (int i = 0; i < n; i++) {
     * numbers[i] = scanner.nextInt();
     * }
     * 
     * 
     * for (int i = 0; i < n - 1; i++) {
     * for (int j = i + 1; j < n; j++) {
     * if (numbers[i] > numbers[j]) {
     * int temp = numbers[i];
     * numbers[i] = numbers[j];
     * numbers[j] = temp;
     * }
     * }
     * }
     * 
     * System.out.println("Sorted numbers:");
     * for (int number : numbers) {
     * System.out.print(number + " ");
     * }
     * }
     */
}
