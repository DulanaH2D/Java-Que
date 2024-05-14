import java.util.Scanner;

public class Que015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startNum = sc.nextInt();
        System.out.println("Enter the ending number: ");
        int endNum = sc.nextInt();
        int result = 0;

        int x = 1;

        while (result < endNum) {
            result = (x * (x + 1)) / 2;
            x++;
            if (result <= endNum && result >= startNum) {
                System.out.print(result + " ");
            }
        }
        sc.close();
    }

}
