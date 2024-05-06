import java.util.Scanner;

public class que005 {
    static boolean isTriangular(int num) {
        if (num < 0)
            return false;

        int sum = 0;

        for (int n = 1; sum <= num; n++) {
            sum = sum + n;
            if (sum == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner myObj = new Scanner(System.in);
        int n = myObj.nextInt();
        if (isTriangular(n))
            System.out.print("The number "
                    + "is a triangular number");
        else
            System.out.print("The number"
                    + " is NOT a triangular number");
    }

}
