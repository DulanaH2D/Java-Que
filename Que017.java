import java.util.Scanner;

public class Que017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int startNum = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int endNum = sc.nextInt();

        System.out.print("Triangular numbers between " + startNum + " and " + endNum + " are: ");
        tranNum(startNum, endNum);
        System.out.println();
        System.out.println("Square numbers between " + startNum + " and " + endNum + " are: ");
        squarNum(startNum, endNum);

        sc.close();
    }

    public static void tranNum(int startNum, int endNum) {
        int result = 0;
        int x = 1;

        while (result < endNum) {
            result = (x * (x + 1)) / 2;
            x++;
            if (result <= endNum && result >= startNum) {
                System.out.print(result + " ");
            }
        }
    }

    public static void squarNum(int startNum, int endNum) {
        int result = 0;
        int x = 1;

        while (result < endNum) {
            result = x * x;
            x++;
            if (result <= endNum && result >= startNum) {
                System.out.print(result + " ");
            }
        }
    }

}
