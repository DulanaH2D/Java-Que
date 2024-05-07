import java.util.Scanner;

class Que004 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = myObj.nextInt();

        if (num / 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

    }
}
