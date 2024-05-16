import java.util.*;

public class Que031 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers separated by commas: ");
        // Read the input line as a string
        String input = scanner.nextLine();

        // Split the input string by commas to get individual number strings
        String[] numberStrings = input.split(",");

        double sum = 0;
        int count = 0;

        // Iterate over the number strings
        for (String numberString : numberStrings) {
            // Trim any whitespace around the number string
            numberString = numberString.trim();

            // Convert the number string to a double and add to the sum
            double number = Double.parseDouble(numberString);
            sum += number;
            count++;
        }

        double average = sum / count;

        System.out.println("The average is: " + average);

        scanner.close();
    }
}
